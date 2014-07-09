#!/usr/bin/perl
use utf8;
use warnings;
use strict;

my $sum_to_thousand = total(1..1000);
print "Sum of the numbers from 1 to 1,000 is $sum_to_thousand.\n";

sub total {
    my $sum = 0;
    foreach( @_ ) {
        $sum += $_;
    }

    $sum;
}

