set -x
set -e

if [ ! -d build ]; then
  mkdir build
  # rm -rf build
fi

(cd build && cmake .. && make)

# test
set +x
echo
echo "-- expected --"
echo "\
5.00 10.00

-10.00 5.00
-5.00 10.00 "

input="\
2 1
10 5
1 90

3 2
5 5 5
1 270
2 90"

echo "--- input --"
echo "$input"

echo "-- actual --"
echo "$input" | build/poj2991 
