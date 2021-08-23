package boj.bronze.bronzeIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) { // 5번
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = N - i ; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}