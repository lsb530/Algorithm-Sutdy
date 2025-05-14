package programmers.level1.문자열내마음대로정렬하기;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertArrayEquals(solution(new String[]{"sun", "bed", "car"}, 1),
            new String[]{"car", "bed", "sun"});
        assertArrayEquals(solution(new String[]{"abce", "abcd", "cdx"}, 2),
            new String[]{"abcd", "abce", "cdx"});
    }

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (s1, s2) -> {
            char c1 = s1.charAt(n);
            char c2 = s2.charAt(n);
            if(c1 == c2) return s1.compareTo(s2);
            else return c1 - c2;
        });
        return strings;
    }
}