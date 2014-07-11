#!/usr/bin/perl
use utf8;
use warnings;
use strict;
use POSIX; 
use 5.010; # for say

say "Enter strings (one per line). Press Ctrl+D to finish:";
my @input = <STDIN>;

say "1234567890" x 3;

foreach (@input) {
    chomp;
    printf "%20s\n", $_;
}

