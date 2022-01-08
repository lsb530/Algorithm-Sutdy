package skills.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class n개의서로다른원소중r개의원소를순서없이선택하는방법의수 {
    @Test
    public void test() {
        assertEquals(getByRecursion(0, 0), 1);
        assertEquals(getByRecursion(1, 0), 1);
        assertEquals(getByRecursion(2, 1), 2);
        assertEquals(getByRecursion(8, 3), 56);

        assertEquals(getByDp(0, 0), 1);
        assertEquals(getByDp(1, 0), 1);
        assertEquals(getByDp(2, 1), 2);
        assertEquals(getByDp(8, 3), 56);
    }

    public int getByRecursion(int n, int r) {
        if (r == 0 || n == r) {
            return 1;
        }
        return getByRecursion(n - 1, r - 1) + getByRecursion(n - 1, r);
    }

    public int getByDp(int n, int r) {
        int cache[][] = new int[10][10];
        if (r == 0 || n == r) {
            return 1;
        }
        if (cache[n][r] != 0) return cache[n][r];
        return cache[n][r] = getByDp(n - 1, r - 1) + getByDp(n - 1, r);
    }
}