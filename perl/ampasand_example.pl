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

# Without adding an ampasand, built-in function will be called
print("Parenthes without ampasand\n");   # built-in function

# Parenthes around the argument can be omitted
print "Without ampasand\n";              # Still built-in function

# User declared function can be called with an ampasand
&print("With ampasand and parenthes\n"); # User declared one

