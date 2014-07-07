#!/usr/bin/perl
# To see the detail of the warning message, execute it with -Mdiagnostics
# option, i.e. `perl -Mdiagnostics ./warning_example.pl`
use utf8;
use warnings;

$s = "fred123";
$x = $s * 2;
print "$s * 2 = $x\n"; # "fred123" is converted to 123 (number).

