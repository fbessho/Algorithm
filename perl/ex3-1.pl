#!/usr/bin/perl
use utf8;
use warnings;

print "Enter string lines.";
print "This program will return back with the reversed string of what you"
    . "write\n";
print "Enter Ctrl+D to finish your input.\n";

@lines = <STDIN>;
print "\n--- OUTPUT FROM THIS PROGRAM ---\n";
print reverse @lines;

