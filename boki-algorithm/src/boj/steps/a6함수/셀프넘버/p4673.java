package boj.steps.a6함수.셀프넘버;

import java.util.Arrays;

public class p4673 {

    private static final int N_SIZE = 10001;
    static int[] result;

    public static void main(String[] args) {

        result = new int[N_SIZE];
        Arrays.fill(result, 0);

        for (int i = 1; i < N_SIZE; i++) {
            // 재귀호출을 하며 셀프넘버로 계속 호출되는 것들이
            // 아닌 수들을 1 증가시킴
            nonSelfNumber(i);
        }

        for (int i = 1; i < N_SIZE; i++) {
            if (result[i] == 0) {
                System.out.println(i);
            }
        }
    }

    public static int nonSelfNumber(int n) {
        int x = n;
        while (n > 0) {
            x += n % 10;
            n /= 10;
        }
        if (x > N_SIZE - 1) {
            return 0;
        }
        result[x]++;
        return nonSelfNumber(x);
    }
}