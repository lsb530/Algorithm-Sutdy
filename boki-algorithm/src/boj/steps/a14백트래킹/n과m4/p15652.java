package boj.steps.a14백트래킹.n과m4;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p15652 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    static int N;
    static int M;
    static int[] arr;
    static boolean[] visit;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        visit = new boolean[N];

        dfs(0);
        sb.setLength(sb.length() - 1); // 걍 마지막 공백제거
        System.out.println(sb);
    }

    public static void dfs(int depth) {
        if (depth == M) {
            boolean flag = true; // 증가하는지 체크
            if (depth >= 2) { // 바운드인덱스에러 조심
                for (int i = 0; i < arr.length - 1; i++) {
                    if(arr[i+1]-arr[i]<0) {
                        flag = false;
                        break;
                    }
                }
                if (!flag) {
                    return;
                }
            }
            for (int val : arr) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
//                visit[i] = true;
                arr[depth] = i + 1;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}