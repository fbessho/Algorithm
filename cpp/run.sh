#!/bin/bash
set -e

# Generate google test library
make

if [ !d build ]; then
  mkdir build
fi

(cd build && cmake .. && make)

test_binaries=`find build -type f -name "*unittest"`

echo "test binaries $test_binaries"

for t in $test_binaries; do
  echo "Running $t..."
  $t
done
