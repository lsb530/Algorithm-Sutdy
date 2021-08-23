package boj.steps.a5a1차원배열.최댓값;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int max = arr[0];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
//        int max = Arrays.stream(arr).max().getAsInt();
//
//        int[] maxIndex = IntStream.range(0, arr.length)
//            .filter(i -> arr[i] == max)
//            .toArray();
//        System.out.println(max);
//        System.out.println(maxIndex[0] + 1);
    }
}