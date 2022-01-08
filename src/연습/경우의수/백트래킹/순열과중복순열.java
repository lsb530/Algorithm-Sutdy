package 연습.경우의수.백트래킹;

import java.util.Arrays;

public class 순열과중복순열 {

    // 순열이란, 임의의 집합을 순서를 부여하여 차례로 나열하는 것을 말한다.
    //Ex) 이를 테면 집합 {1, 2, 3}중 3개의 원소를 선택한 순열을 구하시오라고 하면,
    // 결과는 {123, 132, 213, 231, 312, 321} 총 6가지의 경우의 수가 나온다.
    static int[] arr = {1, 2, 3};
    static int[] result;
    static boolean[] visit;

    static int cnt;

    public static void main(String[] args) {
        visit = new boolean[arr.length];
        result = new int[arr.length];
        permutation(0);
        System.out.println(cnt);
        cnt = 0;
        System.out.println("-----------------");
        permutation_duplicated(0);
        System.out.println(cnt);
    }

    public static void permutation(int depth) {
        if (depth == 3) {
            cnt++;
            System.out.println(Arrays.toString(result));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visit[i]) {
                visit[i] = true;
                result[depth] = arr[i];
                permutation(depth + 1);
                visit[i] = false;
            }
        }
    }

    public static void permutation_duplicated(int depth) {
        if (depth == 3) {
            cnt++;
            System.out.println(Arrays.toString(result));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            result[depth] = arr[i];
            permutation_duplicated(depth + 1);
        }
    }
}