#include <iostream>
#include <string>

using namespace std;

int main(void) {
    string str;
    cin >> str;
//    for(int i=0; i < str.length(); i++) {
//        cout << str[i] << endl;
//    }
    for(char c : str) {
        cout << c << endl;
    }
    return 0;
}