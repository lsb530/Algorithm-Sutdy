package boj.steps.a12정렬.통계학;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int[] arr;
    static int[][] cntArr;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];
        cntArr = new int[N][2];
        int sum = 0;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
            for (int j = 0; j < N; j++) {

            }
            cntArr[i][0] = arr[i];
        }
        Arrays.sort(arr);
        int round = Math.round((float) sum / N);
        bw.write(round + "\n");
        bw.write(arr[N / 2] + "\n");
        bw.write((max - min) + "\n");
        bw.flush();
        bw.close();
    }
}