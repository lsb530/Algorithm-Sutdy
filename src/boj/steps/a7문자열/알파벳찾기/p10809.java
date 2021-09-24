package boj.steps.a7문자열.알파벳찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10809 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String s = br.readLine();
        for (int i = 0; i < 26; i++) {
            System.out.print(s.indexOf((int) 'a' + i) + " ");
        }
    }
}