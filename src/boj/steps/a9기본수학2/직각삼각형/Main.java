package boj.steps.a9기본수학2.직각삼각형;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a == 0 && b == 0 && c == 0) {
                bw.flush();
                bw.close();
                break;
            }
            int[] arr = new int[3];
            arr[0] = a; arr[1] = b; arr[2] = c;
            Arrays.sort(arr);
            int max = arr[2];
            if(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(max,2)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
    }
}