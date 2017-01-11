/*
セグメント木
Range Minumum Query (RMQ)


*/

#include <iostream>
#include <string>
#include <math.h>

#define PI 3.14159265

using namespace std;

#define MAX_CMD 100000
#define MAX_SEGMENTS 10000

int l[MAX_SEGMENTS], angles[MAX_SEGMENTS];
int c[MAX_CMD*2];

void print_endpoint(int n);

int main(void) {

    int n, c_len;

    int tmp_idx, tmp_degree;  // segment idx and dgree in commands
    string tmp_str;

    while(true) {
        for(int i=0; i<MAX_SEGMENTS; i++) angles[i] = 180;

        if(! (cin >> n >> c_len)) break;

        // cout << "n, c_len = " << n << ", " << c_len << endl;
        for(int i=0; i<n; i++)
            cin >> l[i];
        for(int i=0; i<c_len; i++) {
            cin >> tmp_idx >> tmp_degree;
            // update angle
            angles[tmp_idx] = tmp_degree;
            print_endpoint(n);
        }
        cout << endl;
    }   

    return 0;
}

void print_endpoint(int n) {
    double x, y, d, x_new, y_new;
    x=0, y=0, d=180;
    for(int j=0; j<n; j++) {
        // compute j-th point 
        d += angles[j] - 180;
        // cout << "DEBUG " << x << " " << y << " " << d << endl;
        x_new = x + l[j] * sin(d * PI/180);
        y_new = y - l[j] * cos(d * PI/180);
        x = x_new; y =y_new;
    }
    cout << x_new << " " << y_new << endl;
}
