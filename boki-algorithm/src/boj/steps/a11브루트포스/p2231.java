package boj.steps.a11브루트포스;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int[] counting = new int[100000];
        Arrays.fill(counting,0);
        // 생성자 구하기
        for (int i = 0; i < counting.length; i++) {
            getInitializer(counting, i);
        }
        System.out.println(counting[x]);

    }

    private static void getInitializer(int[]arr, int x) {
        if (x < 10) {
            return;
        }
        int idx = x;
        int init = 0;
        init += x;
        while (x > 0) {
            init += x % 10;
            x /= 10;
        }
        if (arr[idx] == 0) { // 초기일 경우
            arr[idx] = init;
        } else {
            // 초기가 아닐 경우 => 최소값을 저장
            if (arr[idx] > init) {
                arr[idx] = init;
            }
        }
    }

}