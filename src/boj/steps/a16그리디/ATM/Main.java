package boj.steps.a16그리디.ATM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] people;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        people = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) {
            people[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(people);
        int time = 0;
        int ans = 0;
        for (int j = 0; j < N; j++) {
            time += people[j];
            ans += time;
        }
        System.out.println(ans);
    }

}