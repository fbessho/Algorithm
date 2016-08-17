#include <iostream>
using namespace std;

void show(int a[], int n) {
	for(int i=0; i<n; i++) {
		 cout << a[i];
		 if(i!=n) cout << " ";
	}
	cout << endl;
}
