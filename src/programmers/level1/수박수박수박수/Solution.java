package programmers.level1.수박수박수박수;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(3), "수박수");
//        Assertions.assertEquals(solution(4), "수박수박");
    }

    public String solution(int n) {
        boolean flag = true;
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(flag) {
                answer.append("수");
                flag = false;
            } else {
                answer.append("박");
                flag = true;
            }
        }
        return answer.toString();
    }
}