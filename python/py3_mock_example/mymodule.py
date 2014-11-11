import anothermodule

class ClassName1():
    def __init__(self):
        print('ClassName1 initialized')


class ClassName2():
    def __init__(self):
        print('ClassName2 initialized')


def create_classes():
    a = ClassName1()
    b = ClassName2()
    anothermodule.Spam()


if __name__ == '__main__':
    create_classes()
