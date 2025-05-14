package boj.steps.a21이분탐색.나무자르기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] treeHeights;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        treeHeights = new int[N];
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        long max = Long.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            treeHeights[i] = Integer.parseInt(st.nextToken());
            max = Long.max(max, treeHeights[i]);
        }
        long min = 0, cut = 0;
        while(min < max) { // max가 작아짐
            cut = (max + min) / 2;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                if(treeHeights[i] - cut > 0) { // 양수일때만
                    // 나무의 잘린 길이만큼 더해줌
                    // cut 길이 = 높이 - 자르는 위치
                    sum += (treeHeights[i] - cut);
                }
            }
            if(sum < M) max = cut;
            else min = cut + 1;
        }
        System.out.println(min - 1);
    }
}