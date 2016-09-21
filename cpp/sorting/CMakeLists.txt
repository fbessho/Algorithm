cmake_minimum_required (VERSION 2.6)
project (sorting)

# GTEST
include_directories ("/Users/besshf/src/googletest/googletest/include")
include_directories ("/Users/besshf/src/googletest/googlemock/include")

add_executable(shellsort_unittest shellsort.cpp shellsort_unittest.cpp)
target_link_libraries(shellsort_unittest /Users/besshf/src/Algorithm/cpp/gmock_main.a)

add_executable(bubblesort_unittest bubblesort.cpp bubblesort_unittest.cpp)
target_link_libraries(bubblesort_unittest /Users/besshf/src/Algorithm/cpp/gmock_main.a)
