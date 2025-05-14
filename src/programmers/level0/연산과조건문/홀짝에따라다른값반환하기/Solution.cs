using System;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        bool isEven = n % 2 == 0;
        int start = isEven ? 2 : 1;
        for (int i = start; i <= n; i+=2)
        {
            answer += (isEven) ? i * i : i;
        }
        return answer;
    }
}