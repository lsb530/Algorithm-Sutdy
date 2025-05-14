#include <string>
#include <vector>

using namespace std;

// mine
string solution(string my_string, string overwrite_string, int s) {
    vector<char> v(my_string.length());
    for (int i = 0; i < my_string.length(); ++i) {
        v[i] = my_string[i];
    }
    for (int i = 0, j = s; i < overwrite_string.length(); ++i, ++j) {
        v[j] = overwrite_string[i];
    }
    string answer(v.begin(), v.end());
    return answer;
}

// simple
string solution(string my_string, string overwrite_string, int s) {
    return my_string.replace(s,overwrite_string.size(),overwrite_string);
}