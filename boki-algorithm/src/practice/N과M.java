package practice;

import java.util.Scanner;

public class N과M {

    static int N, M;
    static int[] arr;
    static boolean[] visit;

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        visit = new boolean[N];
        DFS(0);
        System.out.println(sb);
    }

    static void DFS(int k) {
        if(k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if(!visit[i]) {
                visit[i] = true;
                arr[k] = i + 1;
                DFS(k + 1);
                visit[i] = false;
            }
        }
    }
}