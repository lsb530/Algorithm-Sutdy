package boj.silver.silverIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1463 {
    public static void main(String[] args) throws IOException {
        // 10일때 예외발생
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int x = Integer.parseInt(br.readLine());
//        answer(x);
        int ans = go(x);
        System.out.println(ans);
    }

    private static int go(int n) {
        System.out.println("n = " + n);
        int[] d = new int[n+1];
        if (n == 1) return 0;
        if (d[n] > 0) return d[n];
        System.out.println("d["+n+"] = " + d[n]);
        d[n] = go(n-1) + 1;
        System.out.println("d["+n+"] = " + d[n]);
        if(n%2==0) {
            int temp = go(n/2) + 1;
            if (d[n] > temp) d[n] = temp;
        }
        if(n%3==0) {
            int temp = go(n/3) + 1;
            if (d[n] > temp) d[n] = temp;
        }
        System.out.println("d["+n+"] = " + d[n]);
        return d[n];
    }

    private static void answer(int x) {

        int[] d = new int[x+1];
        d[1] = 0;
        for (int i=2; i<=x; i++) {
            d[i] = d[i-1] + 1;
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
        }
        System.out.println(d[x]);
    }


}