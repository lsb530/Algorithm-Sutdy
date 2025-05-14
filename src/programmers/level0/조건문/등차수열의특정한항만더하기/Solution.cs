using System;

public class Solution {
    public int solution(int a, int d, bool[] included) {
        int answer = 0;
        for (int i = 0; i < included.Length; i++)
        {
            answer += included[i] ? i * d + a : 0;
        }
        return answer;
    }
}