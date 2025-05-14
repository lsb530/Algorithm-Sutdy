package programmers.level1.짝수와홀수;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertEquals(solution(3),"Odd");
        Assertions.assertEquals(solution(4),"Even");
        Assertions.assertEquals(solution(0),"Even");
    }

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}