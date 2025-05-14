package boj.steps.a15동적계획법1.타일;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1904 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // N:1 => 1 => 1
        // N:2 => 11, 00 => 2
        // N:3 => 111, 100, 001 => 3
        // N:4 => 1111, 0000, 1100, 0011, 1001 => 5
        // N:5 => 11111, 10000, 00001, 11100, 00111, 10011, 11001, 00100 => 8
        // 피보나치처럼 증가
        int n = Integer.parseInt(br.readLine());
        System.out.println(Tile(n));
    }

    public static int Tile(int x) {
        if(x > 0 && x <= 2) return x;
        int t1 = 1, t2 = 2, sum = 0;
        // Bottom-up 을 이용했쥐 >< 뀨
        // 재귀보다는 반복이 더 낫다
        for (int i = 2; i < x; i++) {
            sum = (t1 + t2) % 15746;
            t1 = t2;
            t2 = sum;
        }
        return sum;
    }

}