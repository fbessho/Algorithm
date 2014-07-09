#!/usr/bin/perl
use utf8;
use warnings;

sub print_test {
    my $var1, $var2; # var2 is a global variable, not a local
    $var1 = "1";
    $var2 = "2";

    print "$var1\n";;
    print "$var2\n";;
}

&print_test;
print "var1 = $var1\n";
print "var2 = $var2\n";

