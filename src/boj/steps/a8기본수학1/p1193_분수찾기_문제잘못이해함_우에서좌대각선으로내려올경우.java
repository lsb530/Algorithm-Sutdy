package boj.steps.a8기본수학1;

import static java.lang.System.in;
import java.io.*;

public class p1193_분수찾기_문제잘못이해함_우에서좌대각선으로내려올경우 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {
        // 1, 3, 6, 10, 15, 21( 초기항이 1, 증가가 2부터 2+n)
        int first = 0;
        int add = 1;
        int idx = 0;
        int target = Integer.parseInt(br.readLine());
        int seq = 0;
        for (int i = 0; i < 5; i++) {
            seq = first + add++;
            first = seq;
            idx++;
            System.out.println("seq = " + seq);
            if (seq > target) { // 1 > 14
                break;
            }
        }
        int diff = seq - target;
        int a = idx;
        int b = 1;
        for (int i = 0; i < diff; i++) {
            a--;
            b++;
        }
        System.out.println(a + "/" + b);
//        System.out.println("diff = " + (seq-target));
//        System.out.println(idx);
    }

}