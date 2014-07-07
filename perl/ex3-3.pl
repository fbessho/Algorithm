#!/usr/bin/perl
use utf8;
use warnings;

print "Enter some names, one per line, then press Ctrl+D\n";
chomp( @names = <STDIN> );
@names = sort @names;

# print names in one line
print "\n----------------------\n";
print " One liner\n";
print "----------------------\n";
print "@names\n";


# print names, each per line.
print "\n----------------------\n";
print " One name per line\n";
print "----------------------\n";
foreach (@names) {
    print "$_\n";
}

