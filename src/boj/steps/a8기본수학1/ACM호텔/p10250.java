package boj.steps.a8기본수학1.ACM호텔;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10250 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] rooms;

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            rooms = new int[H][W];
            int floor = 0;
            int roomNum = 0;
            int idx = 0;
            for (int i = 0; i < W; i++) {
                for (int j = H - 1; j >= 0; j--) {
                    idx++;
                    if (idx == N) {
                        floor = H - j;
                        roomNum = i + 1;
                        break;
                    }
                }
            }
            sb.append(floor);
            if(roomNum < 10) sb.append('0').append(roomNum);
            else sb.append(roomNum);
            sb.append('\n');
        }
        System.out.println(sb);
    }

}