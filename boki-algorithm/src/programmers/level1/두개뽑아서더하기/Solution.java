package programmers.level1.두개뽑아서더하기;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertArrayEquals(solution(new int[]{2, 1, 3, 4, 1}), new int[]{2, 3, 4, 5, 6, 7});
        Assertions.assertArrayEquals(solution(new int[]{5, 0, 2, 7}), new int[]{2, 5, 7, 9, 12});
    }

    public int[] solution(int[] numbers) {
        int[] pairSumArr = new int[201];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                pairSumArr[numbers[i] + numbers[j]] = 1;
            }
        }
        int cnt = 0;
        for (int i = 0; i < pairSumArr.length; i++) {
            if (pairSumArr[i] == 1) {
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        int x = 0;
        for (int i = 0; i < pairSumArr.length; i++) {
            if (pairSumArr[i] == 1) {
                answer[x] = i; x++;
            }
        }
        return answer;
    }
}