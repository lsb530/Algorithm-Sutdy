#include <iostream>

using namespace std;

int main(void) {
    int n;
    cin >> n;
//    if (n % 2 == 0) {
//        cout << n << " is even" << endl;
//    }
//    else {
//        cout << n << " is odd" << endl;
//    }
    cout << n << " is " << (n % 2 == 0 ? "even" : "odd") << endl;
    return 0;
}