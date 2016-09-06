#include <iostream>
using namespace std;

int n = 6;
int r = 10;
int x[6] = {1, 7, 15, 20, 30, 50};

int main(void) {
    int current = 0;
    int prev = 0;
    int ans = 0;
    for(;;) {
        cout << prev << " " << current << endl;
        if( x[prev]+r < x[current]  ) {
            ans++;
            prev = current;
        }
        else if( current == n-1 ) {
            ans++;
            break;
        }
       current++;
    }
    cout << ans << endl;
}
