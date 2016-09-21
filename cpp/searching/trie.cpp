#include <vector>
#include <string>
#include "trie.h"

#include <iostream>

using namespace std;

Trie::Trie(vector<string> s_vec) {
  root = Node();
  initialize(s_vec);
}

void Trie::initialize(vector<string> s_vec) {
  for(string s: s_vec) {
    Node* current = &root;
    for(int i=0; i<s.size(); i++) {
      char c = s.at(i);
      Node* next = current->children[c - 'a'];
      if(next==NULL) {
        // not created yet
        next = new Node();
        current->children[c-'a'] = next;
      }
      current = next;
    }
  }
}

bool Trie::find(string s) {
  // cerr << "Find.." << s << endl;
  Node* current = &root;
  for(int i=0; i<s.size(); i++) {
    char c = s.at(i);
    current = current->children[c-'a'];
    // cerr << i << "th: " << current << endl;
    if(current == NULL) {
      // not found
      return false;
    }
  }
  return true;
}
