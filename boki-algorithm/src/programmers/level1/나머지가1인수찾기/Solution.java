package programmers.level1.나머지가1인수찾기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        // 3 <= n <= 1,000,000
        Assertions.assertEquals(solution(10), 3);
        Assertions.assertEquals(solution(12), 11);
        Assertions.assertEquals(solution(20), 19);
        Assertions.assertEquals(solution(3), 2);
        Assertions.assertEquals(solution(5), 2);
    }

    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if(n%i == 1) {
                answer = i;
                break;
            }
        }
//        System.out.println(answer);
        return answer;
    }
}