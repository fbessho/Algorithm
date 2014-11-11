#!/usr/bin/perl
use utf8;
use warnings;
use strict;

my %word_count;

print "Enter words, then press Ctrl+D:\n";
while (<STDIN>) {
    my $word = $_;
    chomp $word;

    $word_count{$word} += 1;
}

foreach my $word (sort keys %word_count) {
    printf "%10s: %3d\n", $word, $word_count{$word};
}

