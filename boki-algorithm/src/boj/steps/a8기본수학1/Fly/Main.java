package boj.steps.a8기본수학1.Fly;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int distance = y - x;
            int max = (int) Math.sqrt(distance);
            if (max == Math.sqrt(distance)) {
                bw.write(max * 2 - 1 + "\n");
            } else if (distance <= max * max + max) {
                bw.write(max * 2 + "\n");
            } else {
                bw.write(max * 2 + 1 + "\n");
            }
        }
        bw.flush();
        bw.close();
    }

}