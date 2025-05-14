package boj.steps.a16그리디.회의실배정;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] rooms;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        rooms = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            rooms[i][0] = start;
            rooms[i][1] = end;
        }
        Arrays.sort(rooms, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                // 종료 시간이 같은 경우는 시작 시간으로 정렬
                if (o1[1] == o2[1]) return o1[0] - o2[0];
                // 이외에는 종료 시간으로 정렬
                return o1[1] - o2[1];
            }
        });
        int prevEndTime = 0;
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (rooms[i][0] < prevEndTime) continue;
            cnt++;
            prevEndTime = rooms[i][1];
        }
        System.out.println(cnt);
    }
}