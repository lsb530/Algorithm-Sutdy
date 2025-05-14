package skills.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class 주어진수보다작은소수의개수 {
    @Test
    public void test() {
        assertEquals(solution(-3),-1);
        assertEquals(solution(0),0);
        assertEquals(solution(1),0);
        assertEquals(solution(2),1);
        assertEquals(solution(3),2);
        assertEquals(solution(8),4);
        assertEquals(solution(12),5);
        assertEquals(solution(44),14);
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43
    }

    public int solution(int num) {
        if (num < 0) {
            return -1;
        }
        int[] checkList = new int[num + 1];

        for (int i = 2; i <= num; i++) {
            checkList[i] = i;
        }
        int baseNum = (int) Math.sqrt(num);

//        for (int i = 2; i <= baseNum; i++) {
        for (int i = 2; i * i <= num; i++) {
            if (checkList[i] == 0) {
                continue;
            }
            for (int k = i; k <= num; k += i) {
                if (checkList[k] != i && checkList[k] % i == 0) {
                    checkList[k] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 0; i <= num; i++) {
            if (checkList[i] != 0) {
                count++;
            }
        }

        return count;
    }

}