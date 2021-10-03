package boj.steps.a9기본수학2.터렛;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int x1, x2, y1, y2, r1, r2;
    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());

            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());
            sb.append(turret()).append("\n");
        }
        System.out.println(sb);
    }
    static int turret() {

        // 중점간 거리 distance 제곱
        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // case 1 : 중점이 같으면서 반지름도 같을 경우
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // case 2-1 : 두 원의 반지름 합보다 중점간 거리가 더 길 때
        else if(distance_pow > Math.pow(r1 + r2, 2)) {
            return 0;
        }

        // case 2-2 : 원 안에 원이 있으나 내접하지 않을 때
        else if(distance_pow < Math.pow(r2 - r1, 2)) {
            return 0;
        }

        // case 3-1 : 내접할 때
        else if(distance_pow == Math.pow(r2 - r1, 2)) {
            return 1;
        }


        // case 3-2 : 외접할 때
        else if(distance_pow == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        else {
            return 2;
        }
    }
}