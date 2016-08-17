#include <iostream>
using namespace std;

void show(int a[], int n);

void sort(int a[], int n) {
  int start, end;
  start = 0, end = n-1;
  int tmp;

  while(end - start > 1) {
    for(int i=end; i>=start+1; i--) {
      if(a[i-1]>a[i]) {
        tmp = a[i-1]; a[i-1] = a[i]; a[i] = tmp;
      }
    }
    start++;
  }
}

int main() {
	int a[100] = {
		56, 45, 88, 92, 78, 62, 95, 12, 33, 40, 47, 16, 69, 48, 87, 5, 90,
		50, 60, 6, 74, 36, 38, 63, 0, 91, 57, 61, 76, 59, 82, 43, 51, 11,
		29, 77, 89, 79, 7, 98, 3, 94, 52, 8, 35, 28, 23, 41, 26, 14, 24, 20,
		31, 18, 46, 65, 96, 37, 34, 21, 30, 13, 83, 1, 81, 42, 2, 54, 99, 85,
		44, 49, 68, 19, 64, 53, 66, 58, 75, 55, 70, 10, 32, 84, 4, 9, 39, 93,
		15, 80, 73, 27, 17, 25, 72, 67, 86, 97, 22, 71};
	int n = 100;
  cout << "Before: ";
	show(a, n);
	sort(a, n);
	cout << "After: ";
	show(a, n);
}
