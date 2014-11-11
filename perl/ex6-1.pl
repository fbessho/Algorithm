#!/usr/bin/perl
use utf8;
use warnings;
use strict;

my %last_names = (
    'Sho' => 'Sakurai', 
    'Satoshi' => 'Ohno',
    'Kazuya' => 'Ninomiya',
    'Jun' => 'Matsumoto',
    'Masaki' => 'Aiba',
);

print "Enter first name: ";
chomp(my $first_name = <STDIN>);

print "The last name of $first_name is $last_names{$first_name}\n";

