using System;

public class Solution {
    public string solution(string code) {
        string answer = "";
        int mode = 0;
        for (int i = 0; i < code.Length; i++)
        {
            char c = code[i];
            if (c == '1')
            {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) answer += c;
        }
        return answer.Length == 0 ? "EMPTY": answer;
    }
}