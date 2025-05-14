#include <iostream>
#include <string>
#include <vector>

using namespace std;

int solution(string ineq, string eq, int n, int m) {
    int answer = 0;
    string statement = ineq + eq;
    if (statement == "<=") answer = n <= m;
    else if (statement == "<!") answer = n < m;
    else if (statement == ">=") answer = n >= m;
    else if (statement == ">!") answer = n > m;
    else {
        throw logic_error("Invalid Statement");
    }
    return answer;
}

int main(int argc, char *argv[]) {
    cout << solution("<", "=", 20, 50) << endl;
    cout << solution(">", "!", 41, 78) << endl;
    cout << solution("<<", "!", 41, 78) << endl;
}