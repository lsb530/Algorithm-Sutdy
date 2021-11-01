package boj.steps.a20분할정복.곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int a, b, c;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        System.out.println(pow(a, b));
    }
//10 11 12
//2147483647
    static long pow(long a, long exponent) {
//        System.out.println("exponent = " + exponent);
        if(exponent==1) {
//            System.out.println("a = " + a + ", c = " + c);
            // 10 % 12 = 10
            return a%c;
        }
        long temp = pow(a, exponent / 2);
//        System.out.println("exponent = " + exponent + ", temp = " + temp);
        if(exponent%2 == 1) return (temp * temp) % c * a % c; // 4 * 4 % 12 * (10 % 12)
        return temp * temp % c; // 10 * 10 % 12 = 4
    }
}