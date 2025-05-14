#include <string>
#include <vector>

using namespace std;

string solution(string str1, string str2) {
    vector<char> v1(str1.begin(), str1.end());
    vector<char> v2(str2.begin(), str2.end());

    string answer;
    for (int i = 0; i < v1.size(); ++i) {
        answer += v1[i];
        answer += v2[i];
    }

    return answer;
}