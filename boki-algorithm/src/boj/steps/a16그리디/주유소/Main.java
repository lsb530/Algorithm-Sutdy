package boj.steps.a16그리디.주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static long[] distance;
    static long[] fuel;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        distance = new long[N - 1];
        fuel = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            fuel[i] = Integer.parseInt(st.nextToken());
        }
        // 0번은 어쩔 수 없이 기름을 다 채우고, 끝 점을 제외한 fuel 중 가장 작은 노드에서
        // distance 끝까지 연료를 다 채운다
        // 방법1
        long cost = distance[0] * fuel[0];
        long min = fuel[0];
        for (int i = 1; i < N - 1; i++) {
            min = Math.min(min, fuel[i]);
            cost += (distance[i] * min);
        }
        // 방법2: min 구하는 것을 현재 인덱스-1에서 업데이트함
//        long cost = 0;
//        long min = Integer.MAX_VALUE;
//        for (int i = 1; i < N; i++) {
//            min = Math.min(min, fuel[i - 1]);
//            cost += (distance[i - 1] * min);
//        }
        System.out.println(cost);
    }

}