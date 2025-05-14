package boj.steps.a15동적계획법1.계단오르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2579 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] stairs;
    static int[] memo;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        stairs = new int[N + 1];
        memo = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
        }
        // index = 0 은 시작점이다.
        memo[1] = stairs[1];

        // N 이 1이 입력될 수도 있기 때문에 예외처리를 해줄 필요가 있다.
        if (N >= 2) {
            memo[2] = stairs[1] + stairs[2];
        }

        for (int i = 3; i <= N; i++) {
            // max(한번에 2칸 오른것,
            System.out.println("[i-2] = " + memo[i-2]);
            System.out.println("[i-3] + [i-1] = " + (memo[i-3] + stairs[i-1]));
            System.out.println("Max = " + Math.max(memo[i - 2], memo[i - 3] + stairs[i - 1]));
            System.out.println("stairs[i] = " + stairs[i]);
            memo[i] = Math.max(memo[i - 2], memo[i - 3] + stairs[i - 1]) + stairs[i];
            System.out.printf("memo[%d] = %d\n", i, memo[i]);
//            memo[i] = Math.min(memo[i - 2], memo[i - 3] + stairs[i - 1]) + stairs[i];
        }
        System.out.println(memo[N]);
    }

}
//입력1
//3
//10
//20
//15

// 입력2
//6
//10
//20
//15
//25
//10
//20