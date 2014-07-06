#!/usr/bin/perl
use utf8;
use warnings;

print "Input the first number: ";
chomp( $x = <STDIN> );
print "Input the second number: ";
chomp( $y = <STDIN> );

print "Product: " . $x * $y . "\n";

