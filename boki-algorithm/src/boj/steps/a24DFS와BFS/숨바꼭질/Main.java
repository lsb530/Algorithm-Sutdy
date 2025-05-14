package boj.steps.a24DFS와BFS.숨바꼭질;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] check;
    static int N, K;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        check = new int[100001];
        if (N == K) System.out.println(0);
        else BFS(N);
    }

    static void BFS(int num) {
        Queue<Integer> q = new LinkedList<>();
        q.add(num);
        check[num] = 0;
        while(!q.isEmpty()) {
            int[] next = new int[3];
            int cur = q.poll();
            next[0] = cur + 1; // 2
            next[1] = cur - 1; // 0
            next[2] = cur * 2; // 2
            for (int i = 0; i < next.length; i++) {
                if (next[i] == K) { // true
                    System.out.println(check[cur] + 1); // 몇번 이동했는지 출력
                    return;
                }
                if(0 <= next[i] && next[i] < check.length && check[next[i]] == 0) {
                    q.add(next[i]);
                    check[next[i]] = check[cur] + 1;
                }
            }
        }
    }
}