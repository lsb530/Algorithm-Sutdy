#include <iostream>

using namespace std;

int solution(int num, int n) {
    return num%n == 0 ? 1 : 0;
}

int main(int argc, char *argv[]) {
    cout << solution(98, 2) << endl;
    cout << solution(34, 3) << endl;
}
