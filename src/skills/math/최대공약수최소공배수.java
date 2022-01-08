package skills.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 최대공약수최소공배수 {
    @Test
    public void test() {
        assertEquals(gcdByIteration(-1, 0), -1);
        assertEquals(gcdByIteration(0, 0), 0);
        assertEquals(gcdByIteration(6, 8), 2);
        assertEquals(gcdByIteration(3, 3), 3);

        assertEquals(gcdByRecursion(-1, 0), -1);
        assertEquals(gcdByRecursion(0, 0), 0);
        assertEquals(gcdByRecursion(6, 8), 2);
        assertEquals(gcdByRecursion(3, 3), 3);

        assertEquals(gcm(6, 8), 24);
    }

    public int gcdByIteration(int a, int b) {
        if (a < 0 || b < 0) return -1;
        int mod;
        while (b != 0) {
            mod = a % b;
            a = b;
            b = mod;
        }
        return a;
    }

    public int gcdByRecursion(int a, int b) {
        if (a < 0 || b < 0) return -1;
        if (b == 0) {
            return a;
        }
        return gcdByRecursion(b, a % b);
    }

    public int gcm(int a, int b) {
        return a * b / gcdByRecursion(a, b);
    }
}