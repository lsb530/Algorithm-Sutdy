package boj.steps.a5a1차원배열.평균;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p1546 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    static double[] score;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        score = new double[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        double ans = 0;
        double max = score[0];
        for (int i = 0; i < N; i++) {
            score[i] = Double.parseDouble(st.nextToken());
            max = Math.max(max, score[i]);
            ans += score[i];
        }
        ans /= N;
        System.out.println(ans*100/max);
    }

}