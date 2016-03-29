#!/bin/sh
NAME=poj3617_best_cow_line

echo "Compiling.."
g++ $NAME.cpp -o $NAME
if [ $? -ne 0 ]; then
    echo "Compilation failure.."
    exit 1
fi

function check() {
    if [ "$ACTUAL" == "$EXPECTED" ]; then
        echo "PASS ($ACTUAL)"
    else
        echo "FAILED ($EXPECTED != $ACTUAL)"
    fi
}

echo -----------------
echo Example 1
echo -----------------
EXPECTED="ABDBCD"
ACTUAL=$(cat <<EOF | ./$NAME
6
A
B
D
B
C
D
EOF)
check

echo -----------------
echo Example 2
echo -----------------
EXPECTED="BABCBD"
ACTUAL=$(cat <<EOF | ./$NAME
6
B
A
D
B
C
B
EOF)
check

echo -----------------
echo Example 3
echo -----------------
EXPECTED="BABCBD"
ACTUAL=$(cat <<EOF | ./$NAME
6
B
C
B
D
A
B
EOF)
check
