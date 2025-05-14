#include <string>
#include <vector>

using namespace std;

string solution(string code) {
    string answer;
    int mode = 0;
    for (int i = 0; i < code.length(); ++i) {
        char c = code[i];
        if (c == '1') {
            mode = mode == 0 ? 1 : 0;
            continue;
        }
        if (i%2 == mode) answer += c;
    }
    return answer.empty() ? "EMPTY" : answer;
}