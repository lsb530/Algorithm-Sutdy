package boj.steps.a3for문.빠른AplusB;

import static java.lang.System.in;
import static java.lang.System.out;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p15552 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(br.readLine());
        while (count-- > 0) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            bw.write(a + b + "\n");
        }
        bw.flush();
        bw.close();
    }

}