#include <iostream>
#include <string>

using namespace std;

int main() {
    string str;
    cin >> str;
    for (int i = 0; i < str.length(); i++) {
        char c = str[i];
        if (isupper(c)) {
            cout << (char)tolower(c);
        } else {
            cout << (char)toupper(c);
        }
    }
    return 0;
}
