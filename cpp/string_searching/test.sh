#!/bin/bash
# test.sh
#
# Test string searchig works as expected
# Every compilied program in this dir is supposed to work in the following
# syntax
#
# <command> <pattern> <text>

function test {
	command=$1
	pattern=$2
	text=$3
	expected=$4

	actual=`./$command $pattern $text`
	if [ "$expected" == "$actual" ]; then
		echo "$(tput setaf 2)PASS: $command $pattern $text => $actual$(tput sgr0)"
	else
		echo "$(tput setaf 1)FAILED: $command $pattern $text => $actual != $expected$(tput sgr0)"
	fi
}

	

COMMANDS=brute_force

for c in $COMMANDS; do
	echo "Testing $c.."
	test $c "a" "aaa" 1
done
	
