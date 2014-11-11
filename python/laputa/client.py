import time
import laputa_wrap as laputa


def get_python_author():
    laputa.laputa.load_from_database()
    return laputa.laputa.get_author('python')


if __name__ == '__main__':
    start_time = time.time()
    print 'Python - author is %s' % get_python_author()
    print 'finished in [%.1f sec]' % (time.time() - start_time)
