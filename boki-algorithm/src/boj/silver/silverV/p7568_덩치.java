package boj.silver.silverV;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p7568_덩치 {
    /*
    // kg, cm
input
5
55 185
58 183
88 186
60 175
46 155

output
2 2 1 2 5
     */
    //만일 자신보다 더 큰 덩치의 사람이 k명이라면 그 사람의 덩치 등수는 k+1이 된다.

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    static int[][] people;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        people = new int[n][2];
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                people[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            int curWeight = people[i][0];
            int curHeight = people[i][1];
            int saved = 0;
            for (int j = 0; j < n; j++) {
                if (i==j) continue;
                int diffWeight = people[j][0];
                int diffHeight = people[j][1];
                if (curWeight < diffWeight && curHeight < diffHeight) {
                    saved++;
                }
            }
            result[i] = saved+1;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}