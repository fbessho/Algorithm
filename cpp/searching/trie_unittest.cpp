#include "trie.h"
#include "gmock/gmock.h"
#include "gtest/gtest.h"
#include <string>
#include <vector>

using namespace std;

TEST(Trie, Simple) {
  vector<string> input = {"a", "to", "tea", "ted", "ten", "in", "inn"};
  Trie t(input);
  ASSERT_TRUE(t.find("to"));
  ASSERT_FALSE(t.find("too"));
}
