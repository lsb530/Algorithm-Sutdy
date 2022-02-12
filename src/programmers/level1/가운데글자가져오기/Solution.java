package programmers.level1.가운데글자가져오기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("abcde"),"c");
        Assertions.assertEquals(solution("qwer"),"we");
    }

    public String solution(String s) {
        return s.length() % 2 == 0 ?
            s.substring(s.length()/2 - 1 , s.length()/2 + 1) :
            s.substring(s.length()/2, s.length() / 2 + 1);
    }
}