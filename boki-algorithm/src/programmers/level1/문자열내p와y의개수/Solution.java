package programmers.level1.문자열내p와y의개수;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertTrue(solution("pPoooyY"));
        Assertions.assertFalse(solution("Pyy"));
    }

    boolean solution(String s) {
        int p = 0, y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'p' || c == 'P') p++;
            if(c == 'y' || c == 'Y') y++;
        }
        return p == y;
    }
}