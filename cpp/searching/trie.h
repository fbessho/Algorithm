#ifndef BESSHO_ALGORITHM_SEARCHING_TRIE_H_
#define BESSHO_ALGORITHM_SEARCHING_TRIE_H_

#include <string>
#include <vector>

using namespace std;

struct Node {
  // Node* children;
  Node* children[26];
  bool exists;
};

class Trie{
  Node root;
  void initialize(vector<string> s_vec);
public:
  Trie(vector<string> input);
  // Return true if found, else false
  bool find(string s);
};
#endif  // BESSHO_ALGORITHM_SEARCHING_TRIE_H_
