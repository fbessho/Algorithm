cmake_minimum_required (VERSION 2.6)
project (searching)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

# GTEST
include_directories ("/Users/besshf/src/googletest/googletest/include")
include_directories ("/Users/besshf/src/googletest/googlemock/include")

add_executable(trie_unittest trie.cpp trie_unittest.cpp)
target_link_libraries(trie_unittest /Users/besshf/src/Algorithm/cpp/gmock_main.a)
