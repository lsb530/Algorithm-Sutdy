package boj.steps.a19큐와덱.프린터큐;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int[] arr;
        int N, M;
        while(T-- > 0) {
//1
//6 0
//1 1 9 1 1 1
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            arr = new int[N];
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                int x = Integer.parseInt(st.nextToken());
                queue.offer(x);
                arr[i] = x;
            }
            int target = arr[M];
            int cnt = 0;
            while(!queue.isEmpty()) {
                Integer x = queue.poll();
                if(x <= target) break;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}