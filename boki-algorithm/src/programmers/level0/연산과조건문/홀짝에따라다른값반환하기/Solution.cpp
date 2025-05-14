#include <iostream>
#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    const bool isEven = n % 2 == 0;
    int start = 1;
    if (isEven) {
        start = 2;
    }
    for (int i = start; i <= n; i += 2) {
        if (isEven) {
            answer += i * i;
        } else {
            answer += i;
        }
    }
    return answer;
}


int main(int argc, char *argv[]) {
    cout << solution(7) << endl; // 16
    cout << solution(10) << endl; // 220
}
