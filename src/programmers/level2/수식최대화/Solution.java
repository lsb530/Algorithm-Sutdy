package programmers.level2.수식최대화;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertEquals(solution("100-200*300-500+20"), 60420);
//        assertEquals(solution("50*6-3*2"), 300);
    }

    public long solution(String expression) {
        int[] numbers = Arrays.stream(expression.split("[^\\d]")).mapToInt(Integer::parseInt)
            .toArray();
        ArrayList<Character> ops = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*') ops.add(c);
        }

        long answer = 0;
        return answer;
    }
}