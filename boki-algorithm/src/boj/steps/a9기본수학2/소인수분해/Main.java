package boj.steps.a9기본수학2.소인수분해;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int i = 2; i <= N; i++) {
            if (N == 1) {
                break;
            }
            if (N % i == 0) {
                bw.write(i + "\n");
                N /= i;
                if (i == 2) {
                    i--;
                } else {
                    i = 2;
                }
            }
        }
        bw.flush();
        bw.close();
    }

}