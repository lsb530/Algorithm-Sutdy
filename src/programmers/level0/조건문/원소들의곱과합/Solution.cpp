#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int multiplyAll = 1;
    int sum = 0;
    for (int i : num_list) {
        multiplyAll *= i;
        sum += i;
    }
    return multiplyAll < sum * sum ? 1 : 0;
}