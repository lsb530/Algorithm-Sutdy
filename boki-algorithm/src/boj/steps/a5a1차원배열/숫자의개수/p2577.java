package boj.steps.a5a1차원배열.숫자의개수;
import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int[] container = new int[10];
        int data = 1;
        for (int i = 0; i < 3; i++) {
            data *= Integer.parseInt(br.readLine());
        }
        String s = Integer.toString(data);
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            container[num]++;
        }
        for (int j : container) {
            System.out.println(j);
        }
    }
}