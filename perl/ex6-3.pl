#!/usr/bin/perl
use utf8;
use warnings;
use strict;

my $column_wide = 0;
for my $key (keys %ENV) {
    $column_wide = length $key if length $key > $column_wide;
}

for my $key (sort keys %ENV) {
    printf "%${column_wide}s: %s\n", $key, $ENV{$key};
}
    
