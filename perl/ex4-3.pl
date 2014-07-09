#!/usr/bin/perl
use utf8;
use warnings;
use strict;

my @fred = above_average(1..10);
print "\@fred is @fred\n";
print "(Should be 6 7 8 9 10)\n";

my @barney = above_average(100, 1..10);
print "\@barney is @barney\n";
print "(Should be just 100)\n";

sub total {
    my $sum = 0;
    foreach( @_ ) {
        $sum += $_;
    }

    $sum;
}

sub average {
    my @nums = @_;
    my $count = @_;
    total(@nums) / $count;
}

sub above_average {
    my @input_nums = @_;

    my @nums_above_average;
    my $average = average(@input_nums);

    foreach( @input_nums ) {
        if ( $_ > $average ) {
            push @nums_above_average, $_
        }
    }

    @nums_above_average;
}

