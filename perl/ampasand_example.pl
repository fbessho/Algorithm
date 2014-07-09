#!/usr/bin/perl
use utf8;
use warnings;
use strict;

#------------------------------------------------------------------------------
# Example 1: Subroutine must be declare beforehand when using it without 
#            ampasand (&)
#------------------------------------------------------------------------------
&print_spam;
# print_spam; # illegal because print_spam is declared below

sub print_spam {
    print "SPAM!\n";
}

print_spam; # legal as print_spam has been declared

#------------------------------------------------------------------------------
# Example 2: Ampasand is needed when using the same name as a built-in function
#------------------------------------------------------------------------------

sub print {
    print "My Print: ", @_;
}

print "test\n";   # calls built-in funciton
&print("test\n"); # calls `print` subroutine declared above

