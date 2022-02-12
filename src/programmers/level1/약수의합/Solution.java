package programmers.level1.약수의합;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(12), 28);
        Assertions.assertEquals(solution(5), 6);
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if(n%i==0) answer += i;
        }
        return answer;
    }
}