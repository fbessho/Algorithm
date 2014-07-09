#!/usr/bin/perl
use utf8;
use warnings;
use strict;
use 5.010; # for `state`

greet("Fred");
greet("Barney");
greet("Wilma");
greet("Betty");

sub greet {
    my ($name) = @_;

    state @greeted_names;
    print "Hi $name!";
    if (@greeted_names) {
        print " I've seen: @greeted_names\n";
    } 
    else {
        print " You are the first one here!\n";
    }

    push @greeted_names, $name;
}

