Rules for this cpp directory.

# Steps to make googletest
```
# Make gmock.a gmock_main.a
cd <this_dir>
make

cd build
cmake ..
make

# List all available unit tests
find . -type f -name "*test"
```

