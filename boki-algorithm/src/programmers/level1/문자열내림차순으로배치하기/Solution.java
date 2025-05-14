package programmers.level1.문자열내림차순으로배치하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("Zbcdefg"), "gfedcbZ");
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder origin = new StringBuilder(s);
        int len = 0;
        while(len != s.length()) {
            int max = 0;
            for (int i = 0; i < origin.length(); i++) {
                max = Math.max(max, origin.charAt(i));
            }
            char maxChar = (char) max;
            sb.append(maxChar);
            origin.deleteCharAt(origin.indexOf(String.valueOf(maxChar)));
            len++;
        }
        return sb.toString();
    }
}