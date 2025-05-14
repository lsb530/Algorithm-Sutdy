using System;

public class Solution {
    public int solution(string ineq, string eq, int n, int m) {
        int answer = 0;
        switch (ineq + eq)
        {
            case "<=": return n <= m ? 1 : 0;
            case "<!": return n < m ? 1 : 0;
            case ">=": return n >= m ? 1 : 0;
            case ">!": return n > m ? 1 : 0;
        }
        return answer;
    }
}