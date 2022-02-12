package programmers.level1.제일작은수제거하기;

import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        Assertions.assertArrayEquals(solution(new int[]{4, 3, 2, 1}), new int[]{4, 3, 2});
        Assertions.assertArrayEquals(solution(new int[]{4, 3, 4, 1}), new int[]{4, 3, 4});
        Assertions.assertArrayEquals(solution(new int[]{4, 3, 1, 1}), new int[]{4, 3});
        Assertions.assertArrayEquals(solution(new int[]{10}), new int[]{-1});
    }

    public int[] solution(int[] arr) {
        if(arr.length == 1) return new int[]{-1};
        int min = Arrays.stream(arr).min().getAsInt();
        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}