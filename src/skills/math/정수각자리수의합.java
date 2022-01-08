package skills.math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class 정수각자리수의합 {

    @Test
    public void test() {
        assertEquals(solution(0), 0);
        assertEquals(solution(235), 10);
        assertEquals(solution(235678), 31);
        assertEquals(solution(-1), 1);
    }

    public int solution(int value) {
        int base = Math.abs(value);
        int result = 0;

        while (base > 0) {
            result += base % 10;
            base = base / 10;
        }

        return result;
    }
}