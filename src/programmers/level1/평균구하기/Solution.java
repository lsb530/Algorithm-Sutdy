package programmers.level1.평균구하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(new int[]{1, 2, 3, 4}), 2.5);
        Assertions.assertEquals(solution(new int[]{5, 5}), 5);
        Assertions.assertEquals(solution(new int[]{10_000}), 10_000);
    }

    public double solution(int[] arr) {
        int sum = 0;
        for(int s : arr) sum += s;
        return (double) sum / arr.length;
    }
}