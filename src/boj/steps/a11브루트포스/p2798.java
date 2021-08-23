package boj.steps.a11브루트포스;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2798 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        boolean[] flagArr = new boolean[N];
        Arrays.fill(flagArr, false);
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 3;
        int sum = 0;
        int max = 0;
        for (int i = 0; i < N; i++) {
            flagArr[i] = true;
            System.out.println(arr[i]);
            count--;
            for (int j = 0; j < N; j++) {
                if (arr[i] == arr[j] || flagArr[j]) continue;
                System.out.print(arr[j] + " ");
                flagArr[j] = true;
                count--;
                if (count == 0) {
                    j = 0;
//                    Arrays.fill(flagArr, false);
//                    flagArr[i] = true;
                    count = 2;
                    System.out.println(arr[i]);
                    System.out.println();
                }
            }
            System.out.println("\n");
            count = 3;
        }
        // 3장 뽑는 합을 브루트포스
//        for (int i = 0; i < N; i++) { // 첫번째 카드 뽑기
//            sum += arr[i];
//            count--;
//            flagArr[i] = true;
//            for (int j = 0; j < N; j++) {
//                if (count <= 0) break;
//
//            }
//            for (int j = count; j > 0; j--) { // 남은 2장 뽑기
//                for (int k = 0; k < N && count > 0; k++) { // N 돌림
//                    if (arr[i] == arr[k] || flagArr[k]) {
//                        continue;
//                    }
//                    sum += arr[k];
//                    count--;
//                    flagArr[k] = true;
//                    if (sum <= M) {
//                        max = sum;
//                    }
//                }
//                // count = 2
//            }
//            if (max > sum) max = sum;
//            Arrays.fill(flagArr, false);
//            sum = 0;
//        }
//        System.out.println(max);

    }

}