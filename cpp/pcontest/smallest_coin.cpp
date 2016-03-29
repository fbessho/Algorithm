/* Pay A using minimal number of coins */
#include <iostream>
using namespace std;

const int V[6] = {1, 5, 10, 50, 100, 500};

int A = 620;
int C[6] = {3, 2, 1, 3, 0, 2}; 

int main(void) {
  cout << "Pay " << A << endl;
  int ans = 0;
  for(int i=5; i>=0; i--) {
    int n = min(A/V[i], C[i]);
    ans += n;
    A -= V[i] * n;
    cout << "Use " << V[i] << "x" << n << " (remaining " << A << ")" << endl;
  }
  cout << "Ans: " << ans << endl;
}
