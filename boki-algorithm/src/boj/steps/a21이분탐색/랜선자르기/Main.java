package boj.steps.a21이분탐색.랜선자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] lanCables;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        lanCables = new int[K];
        long max = Long.MIN_VALUE;
        for (int i = 0; i < K; i++) {
            lanCables[i] = Integer.parseInt(br.readLine());
            max = Long.max(max, lanCables[i]);
        }
        max++; // div 0에러 처리
        long min = 0, mid = 0;
        while(min < max) { // max가 작아짐 // 상한
            mid = (max + min) / 2;
            long count = 0;
            for (int i = 0; i < K; i++) {
                count += (lanCables[i] / mid);
            }
            if(count < N) max = mid;
            else min = mid + 1;
        }
        System.out.println(min - 1);
    }

}