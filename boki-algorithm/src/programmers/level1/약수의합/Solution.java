package programmers.level1.약수의합;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(12), 28);
        Assertions.assertEquals(solution(5), 6);
    }

    public int solution(int n) {
        long x = 118372;
        String s = String.valueOf(x);
        List<Character> characters = new ArrayList<>();
        for (char c : s.toCharArray()) characters.add(c);
        characters.sort(Comparator.reverseOrder());
        StringBuilder y = new StringBuilder();
        for (Character c : characters) {
            y.append(c);
        }
        long l = Long.parseLong(y.toString());
        System.out.println("l = " + l);
        System.out.println("characters = " + characters);
        System.out.println("s = " + s);
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            // 1번 풀이
            if(n%i==0) answer += i;
            // 2번 풀이
            if ((float)n/i == (int)n/i) {
                answer += i;
                System.out.println(i);
            }
        }
        return answer;
    }
}
