package programmers.level1.최대공약수와최소공배수;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertArrayEquals(solution(3, 12), new int[]{3, 12});
        Assertions.assertArrayEquals(solution(2, 5), new int[]{1, 10});
    }

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = GCD(n, m);
        answer[1] = (n * m) / answer[0];
        return answer;
    }

    public int GCD(int a, int b) {
        if (b == 0) return a;
        else return GCD(b, a%b);
    }
}