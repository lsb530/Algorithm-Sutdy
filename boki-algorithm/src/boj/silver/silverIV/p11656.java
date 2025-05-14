package boj.silver.silverIV;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p11656 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String s = br.readLine();
        String[] result = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, s.length());
            result[i] = str;
        }
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}