import time


data = {}


def load_from_database():
    print '* load from real database'
    time.sleep(2.5)
    global data
    data['author'] = {
        'python': 'GvR',
        'perl': 'larry'
    }


def get_author(language):
    print '* getting author (heavy)'
    time.sleep(1.5)
    return data['author'][language]
