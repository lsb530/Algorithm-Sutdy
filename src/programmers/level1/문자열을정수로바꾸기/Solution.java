package programmers.level1.문자열을정수로바꾸기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution("1234"), 1234);
        Assertions.assertEquals(solution("+1234"), 1234);
        Assertions.assertEquals(solution("-1234"), -1234);
    }

    public int solution(String s) {
        int mul = 1;
        if(s.length() == 5) {
            mul = s.charAt(0) == '-' ? -1 : 1;
            return mul * Integer.parseInt(s.substring(1));
        }
        return Integer.parseInt(s);
    }
}