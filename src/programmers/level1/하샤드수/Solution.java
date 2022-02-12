package programmers.level1.하샤드수;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertTrue(solution(18));
        Assertions.assertTrue(solution(10));
        Assertions.assertTrue(solution(12));
        Assertions.assertFalse(solution(11));
        Assertions.assertFalse(solution(13));
    }

    public boolean solution(int x) {
        String s = Integer.toString(x);
        int sum = 0;
        String[] split = s.split("");
        for(String t: split) sum += Integer.parseInt(t);
        return x % sum == 0;
    }
}