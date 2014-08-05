#!/usr/bin/python

def mod3(x): return x % 3
def mod2(x): return x % 2

x = 5

if (mod3(x) and mod2(x)) == True:
    print "Yey! %d is not multiples of 2 nor 3" % x
else:
    print "Eghh? %d is either multiplies of 2 or 3?" % x

if (mod2(x) and mod3(x)) == True:
    print "Yey! %d is not multiples of 2 nor 3" % x
else:
    print "Eghh? %d is either multiplies of 2 or 3?" % x

if (mod3(x) and mod2(x)):
    print "Yey! %d is not multiples of 2 nor 3" % x
else:
    print "Eghh? %d is either multiplies of 2 or 3?" % x

