#!/usr/bin/perl
use utf8;
use warnings;
use strict;

sub print_test {
    my($var1, $var2);
    $var1 = "1";
    $var2 = "2";

    print "$var1\n";;
    print "$var2\n";;
}

&print_test;
my($var1, $var2) = qw( hello world );
print "var1 = $var1\n";
print "var2 = $var2\n";

