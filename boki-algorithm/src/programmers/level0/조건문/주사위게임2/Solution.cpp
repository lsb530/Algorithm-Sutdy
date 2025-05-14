#include <string>
#include <cmath>

using namespace std;

int solution(int a, int b, int c) {
    int sum = a + b + c;
    int squareSum = pow(a, 2) + pow(b, 2) + pow(c, 2);
    int cubeSum = pow(a, 3) + pow(b, 3) + pow(c, 3);
    if (a != b && b != c && c != a) {
        return sum;
    }
    else if (a == b && b == c) {
        return sum * squareSum * cubeSum;
    }
    else {
        return sum * squareSum;
    }
}