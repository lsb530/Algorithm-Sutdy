package boj.steps.a5a1차원배열.최소최대;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int[] arr = new int[count];
        StringTokenizer data = new StringTokenizer(br.readLine(), " ");
        int i = 0;
        while (data.hasMoreTokens()) {
            arr[i] = Integer.parseInt(data.nextToken());
            i++;
        }
        int max = arr[0];
        int min = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}