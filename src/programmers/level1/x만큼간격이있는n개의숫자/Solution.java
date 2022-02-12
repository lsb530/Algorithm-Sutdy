package programmers.level1.x만큼간격이있는n개의숫자;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertArrayEquals(solution(2, 5), new long[]{2, 4, 6, 8, 10});
        Assertions.assertArrayEquals(solution(4, 3), new long[]{4, 8, 12});
        Assertions.assertArrayEquals(solution(-4, 2), new long[]{-4, -8});
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }
        return answer;
    }
}