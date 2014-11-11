#!/usr/bin/python

def f(a, b, c, d='optional', *args, **kwargs):
    print a, b, c
    print "args:", args
    print 'kwargs', kwargs


f(1, 2, 3)
f(1, 2, c='c', d='d')
f(1, 2, 3, 4, e='c', d='d')

