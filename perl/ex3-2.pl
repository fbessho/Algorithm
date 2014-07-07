#!/usr/bin/perl
use utf8;
use warnings;

@names = qw( fred betty barney dino wilma pebbles bamm-bamm );

print "Enter some numbers from 1 to 7, one per line, then press Ctrl+D.\n";
chomp( @input = <STDIN> );

foreach (@input) {
    print "$names[$_ - 1]\n";
}

