package boj.steps.a5a1차원배열.평균은넘겠지;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p4344 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {

        int C = Integer.parseInt(br.readLine());
        while (C-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] score = new int[N];
            int i = 0;
            double avg = 0;
            while (N-- > 0) {
                score[i] = Integer.parseInt(st.nextToken());
                avg += score[i];
                i++;
            }
            avg /= score.length;
            int cnt = 0;
            for (int j = 0; j < score.length; j++) {
                if (score[j] > avg) {
                    cnt++;
                }
            }
            float x = ((float) cnt / score.length) * 100;
            double v = Math.round(x * 1000) / 1000.0;
            System.out.printf("%.3f%%\n", v);
//            System.out.println(Math.round(x * 1000) / 1000.0 + "%");
        }

    }
}