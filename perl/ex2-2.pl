#!/usr/bin/perl
use utf8;
use warnings;

print "Radius: ";
chomp( $radius = <STDIN> );

$pi = 3.1415926535;
print "Circumference = " . $radius * $pi * 2 . "\n";

