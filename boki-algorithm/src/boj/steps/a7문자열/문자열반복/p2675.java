package boj.steps.a7문자열.문자열반복;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2675 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int count = Integer.parseInt(br.readLine());
        int[] a = new int[count];
        String[] b = new String[count];
        for (int i = 0; i < count; i++) {
            String[] in = br.readLine().split(" ");
            a[i] = Integer.parseInt(in[0]);
            b[i] = in[1];
        }
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < b[i].length(); j++) {
                char c = b[i].charAt(j);
                for (int k = 0; k < a[i]; k++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
    }

}