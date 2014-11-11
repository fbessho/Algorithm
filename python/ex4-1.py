#!/usr/bin/python

L = [2**i for i in xrange(7)]
X = 2**5

if X in L:
    i = L.index(X)
    print "Found in %d!" % i
else:
    print "Not found."

