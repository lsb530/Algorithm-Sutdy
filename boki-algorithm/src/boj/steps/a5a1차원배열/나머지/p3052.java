package boj.steps.a5a1차원배열.나머지;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int[] arr = new int[10];
        int[] diffArr = new int[100];
        Arrays.fill(diffArr, -1);
        for (int i = 0; i < arr.length; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[i] = x % 42;
            diffArr[arr[i]]++;
        }
        int diff = 0;
        for (int i = 0; i < diffArr.length; i++) {
            if (diffArr[i] == -1) {
                continue;
            }
            diff++;
        }
        System.out.println(diff);
    }
}