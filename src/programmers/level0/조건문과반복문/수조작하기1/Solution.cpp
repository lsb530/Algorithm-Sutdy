#include <iostream>
#include <string>
#include <vector>

using namespace std;

int computed(char v) {
    switch (v) {
        case 'w':
            return 1;
        case 's':
            return -1;
        case 'd':
            return 10;
        case 'a':
            return -10;
        default:
            return 0;
    }
}

int solution(int n, string control) {
    int answer = n;
    for(char c : control) {
        answer += computed(c);
    }
    return answer;
}


int main() {
    int a = solution(0, "wsdawsdassw"); // 9
    cout << a << endl;
    return 0;
}