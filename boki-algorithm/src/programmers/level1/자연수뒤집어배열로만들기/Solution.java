package programmers.level1.자연수뒤집어배열로만들기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertArrayEquals(solution(12345), new int[]{5,4,3,2,1});
        Assertions.assertArrayEquals(solution(12045), new int[]{5,4,0,2,1});
        Assertions.assertArrayEquals(solution(12040), new int[]{0,4,0,2,1});
        Assertions.assertArrayEquals(solution(10040), new int[]{0,4,0,0,1});
        Assertions.assertArrayEquals(solution(1), new int[]{1});
        Assertions.assertArrayEquals(solution(12), new int[]{2,1});
    }

    public int[] solution(long n) {
        int many = (int) Math.log10(n) + 1;
        int[] answer = new int[many];
        int i = 0;
        while(n > 0) {
            answer[i++] = (int)(n%10);
            n /= 10;
        }
        return answer;
    }
}