package programmers.level1.이상한문자만들기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("try hello world"), "TrY HeLlO WoRlD");
    }

    public String solution(String s) {
        String answer = "";
        int idx = 0;
        for (int i = 0; i < s.length(); i++, idx++) {
            if (s.charAt(i) == ' ') {
                idx = -1;
            }
            if(idx % 2 == 0) answer += String.valueOf(s.charAt(i)).toUpperCase();
            else answer += String.valueOf(s.charAt(i)).toLowerCase();
        }
        return answer;
    }
}
