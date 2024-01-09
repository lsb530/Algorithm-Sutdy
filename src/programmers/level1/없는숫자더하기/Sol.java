package programmers.level1.없는숫자더하기;

import java.util.Arrays;

public class Sol {

    public int solution(int[] numbers) {
        int x = 9 * (1 + 9) / 2;
        int sum = 0;
        for (int n : numbers) sum += n;
        return x - sum;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(s.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}
