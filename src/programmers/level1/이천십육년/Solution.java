package programmers.level1.이천십육년;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertEquals("TUE", solution(5, 24));
    }

    public String solution(int a, int b) {
        String[] mon = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int total = 0;
        for (int i = 0; i < a - 1; i++) {
            total += day[i];
        }
        total += b - 1;
        return mon[total % 7];
    }
}