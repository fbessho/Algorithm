import os
import laputa
import pickle
from mock import patch
import sys


def laputa_lite_test(market_name):
    def _decorator_func(func):
        def _run(*args, **kwargs):
            rebase = '--rebase' in sys.argv

            if rebase:
                print 'Rebase ' * 20

            laputa_lite = LaputaLite(market_name, rebase=rebase)
            run_func = patch('laputa_wrap.laputa', laputa_lite)(func)
            r_value = run_func(*args, **kwargs)

            if rebase:
                laputa_lite.save()
            return r_value
        return _run
    return _decorator_func


class LaputaLite():
    _cache_dir = os.path.join(os.path.abspath(os.path.dirname(__file__)), 'laputalite_cache')
    _ext = '.laputalite'

    def __init__(self, market_name, rebase=False):
        self._cache = {}
        self.rebase = rebase
        self.market_name = market_name

        if not rebase:
            self.load()

    def __getattr__(self, item):
        if self.rebase:
            return self.get_attr_rebase(item)
        else:
            return self.get_attr_normal(item)

    def save(self):
        file_path = os.path.join(self._cache_dir, self.market_name+self._ext)
        with open(file_path, 'w') as fp:
            pickle.dump(self._cache, fp)

    def load(self):
        file_path = os.path.join(self._cache_dir, self.market_name+self._ext)
        with open(file_path) as fp:
            self._cache = pickle.load(fp)

    def get_attr_normal(self, item):
        def _func(*args):
            return self._cache[item][args]
        return _func

    def get_attr_rebase(self, item):
        def _func(*args):
            if item in self._cache:
                func_cache = self._cache[item]
            else:
                func_cache = {}
                self._cache[item] = func_cache

            if args in func_cache:
                return func_cache[args]
            else:
                laputa_func = getattr(laputa, item)
                r_value = laputa_func(*args)
                func_cache[args] = r_value
                return r_value
        return _func

    def __str__(self):
        return str(self._cache)


if __name__ == '__main__':
    laputa_lite = LaputaLite('test', rebase=False)

    laputa_lite.load_from_database()
    print laputa_lite.get_author('perl')
    print laputa_lite.get_author('perl')
    print laputa_lite.get_author('python')

    # laputa_lite.save()

    print laputa_lite
