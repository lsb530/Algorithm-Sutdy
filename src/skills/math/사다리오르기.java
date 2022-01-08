package skills.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class 사다리오르기 {
    /*
        TASK
        사다리를 한 칸 또는 두 칸씩 오를 수 있다고 했을 때
        사다리 높이에 따른 사다리 오르기 방법의 경우의 수를 구한다.
     */

    @Test
    public void test() {
        assertEquals(solution(0), 1);
        assertEquals(solution(1), 1);
        assertEquals(solution(2), 2);
        assertEquals(solution(3), 3);
        assertEquals(solution(4), 5);
        assertEquals(solution(5), 8);
        assertEquals(solution(6), 13);
        assertEquals(solution(7), 21);
    }

    public int solution(int num) {
        return getCountOfCase(num, 0, num);
//        return getCountOfCaseRec(num);
    }

    // Use while statement
    private int getCountOfCase(int one, int two, int num) {
        int result = 0;
        while (one + two * 2 == num && one >= 0) {
            result += getByRecursion(one + two, two);
            one -= 2;
            two += 1;
        }
        return result;
    }

    public int getByRecursion(int n, int r) {
        int cache[][] = new int[n + 1][r + 1];
        if (r == 0 || n == r) {
            return 1;
        }
        if (cache[n][r] != 0) return cache[n][r];
        return cache[n][r] = getByRecursion(n - 1, r - 1) + getByRecursion(n - 1, r);
    }

    // test code를 작성하다보니 이것이 피보나치 규칙을 따른다는 것을 알게 되었다.
    // Recursion version
    private int getCountOfCaseRec(int num) {
        if (num < 2) {
            return 1;
        }
        return getCountOfCaseRec(num - 1) + getCountOfCaseRec(num - 2);
    }
}