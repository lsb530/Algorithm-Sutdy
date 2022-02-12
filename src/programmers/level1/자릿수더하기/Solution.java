package programmers.level1.자릿수더하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {
    @Test
    void test() {
        Assertions.assertEquals(solution(123), 6);
        Assertions.assertEquals(solution(987), 24);
    }

    public int solution(int n) {
        String N = String.valueOf(n);
        int answer = 0;
        for (int i = 0; i < N.length(); i++) {
            answer += N.charAt(i) - '0';
        }
        return answer;
    }
}