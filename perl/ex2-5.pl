#!/usr/bin/perl
use utf8;
use warnings;

print "Enter a string: ";
$s = <STDIN> ;

print "Enter a number of repetition: ";
chomp( $repeat = <STDIN> );

print $s x $repeat;

