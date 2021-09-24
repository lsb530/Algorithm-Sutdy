package boj.steps.a3for문.AplusBsub7;

import static java.lang.System.in;
import static java.lang.System.out;
import java.io.*;

public class p11021 {
    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    public static void main(String[] args) throws IOException {
        int T = Integer.parseInt(br.readLine());
        int i = 1;
        while(T-- >0) {
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = a + b;
            bw.write("Case #" + i +": "+ c +"\n");
            i++;
        }
        bw.flush();
        bw.close();
    }
}