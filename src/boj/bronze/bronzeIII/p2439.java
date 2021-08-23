package boj.bronze.bronzeIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int end = Integer.parseInt(br.readLine());
        for (int i = 1; i <= end; i++) {
            for (int j = 1; j <= end; j++) {
                if(j<=end-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

}