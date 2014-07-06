#!/usr/bin/perl
use utf8;
use warnings;

print "Radius: ";
chomp( $radius = <STDIN> );

$pi = 3.1415926535;
$circumference = $radius > 0 ? $radius * $pi * 2 : 0;

print "Circumference = $circumference\n";

