package programmers.level1.정수제곱근판별;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(121), 144);
        Assertions.assertEquals(solution(3), -1);
    }

    public long solution(long n) {
        double sqrt = Math.sqrt(n);
        if(sqrt - (int)sqrt == 0.0) return (long)Math.pow(sqrt + 1,2);
        return -1;
    }
}