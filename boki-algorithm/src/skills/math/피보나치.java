package skills.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 피보나치 {
    @Test
    public void test() {
        assertEquals(calcFiboByFor(5), 5);
        assertEquals(calcFiboByFor(6), 8);
        assertEquals(calcFiboByFor(7), 13);

        assertEquals(calcFiboByRec(5), 5);
        assertEquals(calcFiboByRec(6), 8);
        assertEquals(calcFiboByRec(7), 13);

        assertEquals(fiboByDp(5), 5);
        assertEquals(fiboByDp(6), 8);
        assertEquals(fiboByDp(7), 13);
    }

    // Iteration version
    public int calcFiboByFor(int num) {
        if (num < 0) return -1;

        int curValue = 0;
        int prevValue = 1;
        int prevPrevValue = 0;

        for (int i = 2; i <= num; i++) {
            curValue = prevValue +prevPrevValue;
            prevPrevValue = prevValue;
            prevValue = curValue;
        }
        return curValue;
    }

    // Recursion version
    public int calcFiboByRec(int num) {
        if (num < 0) return -1;
        if (num < 2) return num;
        return calcFiboByRec(num - 1) + calcFiboByRec(num - 2);
    }

    // Dynamic Programming version
    public int fiboByDp(int num) {
        return calcFibo(num, new int[num + 1]);
    }

    private int calcFibo(int num, int[] cache) {
        if (num < 2) return num;
        if (cache[num] != 0) return cache[num];//in java, int[] is initialized by 0.

        cache[num] = calcFibo(num - 1, cache) + calcFibo(num - 2, cache);
        return cache[num];
    }
}