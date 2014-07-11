#!/usr/bin/perl
use utf8;
use warnings;
use strict;
use POSIX; 
use 5.010; # for say

print "Enter width of string: ";
my $width = <STDIN>;

say "Enter strings (one per line). Press Ctrl+D to finish:";
my @input = <STDIN>;

my $ruler_length = ceil(($width + 1) / 10);
say "1234567890" x $ruler_length;

foreach (@input) {
    chomp;
    my $format_str = "%" . floor($width) . "s\n" ;
    printf $format_str, $_;
}

