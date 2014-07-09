#!/usr/bin/perl
use utf8;
use warnings;
use strict;
use 5.010; # for `state`

greet("Fred");
greet("Barney");

sub greet {
    my ($name) = @_;

    state $last_greeted_name;
    print "Hi $name!";
    if (defined $last_greeted_name) {
        print " $last_greeted_name is also here!\n";
    } 
    else {
        print " You are the first one here!\n";
    }

    $last_greeted_name = $name;
}

