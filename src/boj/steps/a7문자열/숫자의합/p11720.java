package boj.steps.a7문자열.숫자의합;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        br.readLine();
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += (int)s.charAt(i) - '0';
        }
        System.out.println(sum);
    }

}