package programmers.level1.문자열다루기기본;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertFalse(solution("a234"));
        Assertions.assertFalse(solution("12345"));
        Assertions.assertFalse(solution("12345b"));
        Assertions.assertTrue(solution("1234"));
        Assertions.assertTrue(solution("123456"));
    }

    public boolean solution(String s) {
        String regex = "^\\d{4}$|^\\d{6}$";
        return s.matches(regex);
    }
}