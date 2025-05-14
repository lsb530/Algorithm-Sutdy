package programmers.level1.정수내림차순으로배치하기;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(118372), 873211);
    }

    public long solution(long n) {
//        String[] arr = String.valueOf(n).split("");
//        Arrays.sort(arr, Collections.reverseOrder());
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (char c : chars) sb.append(c);
        return Long.parseLong(sb.reverse().toString());
    }
}