package programmers.level1.콜라츠추측;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(6), 8);
        Assertions.assertEquals(solution(16), 4);
        Assertions.assertEquals(solution(626331), -1);
    }

    public int solution(int num) {
        return assume(num, 0);
    }

    int assume(long num, int cnt) {
        if (num == 1) return cnt;
        if (cnt >= 500) return -1;
        if (num % 2 == 0) num /= 2;
        else num = num * 3 + 1;
        return assume(num,cnt+1);
    }
}