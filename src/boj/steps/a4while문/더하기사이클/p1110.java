package boj.steps.a4while문.더하기사이클;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1110 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        System.out.println(plusCycle(N));
    }

    public static int plusCycle(int N) {
        int m = N;
        int cnt = 0;
        if(N == 0) return 1;
        while(true) {
            int cycle = m%10 * 10 + (m/10 + m%10)%10;
//            System.out.println("cycle = " + cycle);
            cnt++;
            m = cycle;
            if(cycle == N) break;
        }
        return cnt;
    }

}