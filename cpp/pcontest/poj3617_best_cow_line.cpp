#include <iostream>
using namespace std;

#define MAX_N 2000
#define WIDTH 80

int main(void) {
    int n;
    char orig[MAX_N];
    cin >> n;
    for(int i=0; i<n; i++) {
        cin >> orig[i];
    }

    int start=0, end=n-1;
    int char_count = 0;
    int remaining_count = end - start + 1;
    int char_in_line = 0;

    while(remaining_count>0) {

        // Determine left or right to output
        bool left = false;
        for(int i=0; i<remaining_count; i++) {
            if(orig[start+i] < orig[end-i]) {
                left=true;
                break;
            }
            if(orig[start+i] > orig[end-i]) {
                left=false;
                break;
            }
        }
        
        // Output
        if(left)
            cout << orig[start++];
        else
            cout << orig[end--];
        char_in_line++;
        remaining_count--;

        if(char_in_line == WIDTH || remaining_count == 0){
            cout << endl;
            char_in_line = 0;
        }
    }
}

