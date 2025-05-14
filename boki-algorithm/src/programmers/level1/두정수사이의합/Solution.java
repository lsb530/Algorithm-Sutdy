package programmers.level1.두정수사이의합;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(3, 5), 12);
        Assertions.assertEquals(solution(3, 3), 3);
        Assertions.assertEquals(solution(5, 3), 12);
    }

    public long solution(int a, int b) {
        if(a == b) return a;
        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        long answer = 0;
        for (int i = a; i <= b; i++) {
            answer += i;
        }
//        return answer;
        return sumAtoB(Math.min(a, b), Math.max(a, b));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }
}