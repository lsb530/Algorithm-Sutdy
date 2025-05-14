package programmers.level2.최댓값과최솟값;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertEquals(solution("1 2 3 4"), "1 4");
        assertEquals(solution("-1 -2 -3 -4"), "-4 -1");
        assertEquals(solution("-1 -1"), "-1 -1");
    }

    public String solution(String s) {
        int[] nums = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        return min + " " + max;
    }
}