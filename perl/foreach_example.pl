#!/usr/bin/perl
use utf8;
use warnings;

@languages = qw( perl python c java );

foreach $l (@languages) {
    $l .= "!";
}

print "@languages\n";

