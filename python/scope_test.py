#!/usr/bin/python

def f1():
    x = 10
    def f2(x = x):
        print x

    f2()

f1()

        

