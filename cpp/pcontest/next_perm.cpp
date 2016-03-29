// vim: ts=2 sts=2
// Next permutation test

#include <algorithm>
#include <iostream>
using namespace std;

#define MAX_N 1000

int perm2[MAX_N];

void permutation(int n) {
  for(int i=0; i<n; i++) {
    perm2[i] = i;
  }
  cout << perm2 << " " << n << endl;
  do {
    // something
    cout << "hey" << endl;
  } while (next_permutation(perm2, perm2+n));
  return;
}

int main(void){
  cout << "Hello world!" << endl;
  permutation(4);
}
