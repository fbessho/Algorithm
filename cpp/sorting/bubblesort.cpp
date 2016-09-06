#include <iostream>

using namespace std;

// 0, 8, 4, 6, 7, 1, 2, 9, 5, 3
void sort(int a[], int n) {
  int start, end;
  start = 0, end = n-1;
  int tmp;

  while(end - start >= 1) {
    for(int i=end; i>=start+1; i--) {
      if(a[i-1]>a[i]) {
        tmp = a[i-1]; a[i-1] = a[i]; a[i] = tmp;
      }
    }
    start++;
  }
}
