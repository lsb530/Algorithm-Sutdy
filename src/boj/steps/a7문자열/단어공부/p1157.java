package boj.steps.a7문자열.단어공부;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        char[] lower = new char[26];
        char[] upper = new char[26];
        int[] result = new int[26];
        Arrays.fill(result,0);
        int idx = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            lower[idx] = i;
            idx++;
        }
        idx = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            upper[idx] = i;
            idx++;
        }
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < result.length; j++) {
                char c = input.charAt(i);
                if (c == lower[j] || c == upper[j]) {
                    result[j]++;
                }
            }
        }
        char answer;
        idx = 0;
        int maxValue = Arrays.stream(result).max().getAsInt();
        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (maxValue == result[i]) {
                idx = i;
                count++;
            }
        }
        answer = (count>1) ? '?' : upper[idx];
        System.out.println(answer);
    }

}