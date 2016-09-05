#include <iostream>
#include "shellsort.h"

using namespace std;


void sort(int a[], int n) {
	// set initial value of h
	int h;
	for(h=1; h<n/9; h=h*3+1);

	int tmp;
	for(; h>0; h=(h-1)/3) {
		for(int i=0; i<n; i++) {
			int j = i;
			while(j>=h && a[j-h]>a[j]){
				// cout << "swapping a["<<j<< "], a[" << j-h << "]" << endl;
				tmp=a[j-h]; a[j-h]=a[j]; a[j]=tmp;
				// show(a, n);
				j -= h;
			}
		}
	}
}
