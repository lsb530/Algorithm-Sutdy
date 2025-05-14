package boj.steps.a14백트래킹.nQueen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p9663 {

    // 각 인덱스(위치)는 '열'을 가리키고, 해당 인덱스 값은 '행'을 의미
    public static int[] arr;
    public static int N;
    public static int count = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];

        nQueen(0);
        System.out.println(count);
    }

    public static void nQueen(int depth) {
        // 모든 원소를 다 채운 상태면 count 증가 및 return
        if (depth == N) {
            count++;
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        // 1. 재귀 호출 부분
        for (int i = 0; i < N; i++) {
            arr[depth] = i;
            // 놓을 수 있는 위치일 경우 재귀호출
             if (Possibility(depth)) {
                nQueen(depth + 1);
            }
        }

    }

    // 2. 놓을 위치가 다른 퀸으로부터 위협받는지를 검사하는 조건문
    public static boolean Possibility(int col) {

        for (int i = 0; i < col; i++) {
            // 해당 열의 행과 i열의 행이 일치할경우 (같은 행에 존재할 경우)
            if (arr[col] == arr[i]) {
                return false;
            }

            /*
             * 대각선상에 놓여있는 경우
             * (열의 차와 행의 차가 같을 경우가 대각선에 놓여있는 경우다)
             */
            else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }

        return true;
    }
}