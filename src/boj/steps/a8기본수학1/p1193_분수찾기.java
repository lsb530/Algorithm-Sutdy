package boj.steps.a8기본수학1;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1193_분수찾기 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(in));

    public static void main(String[] args) throws IOException {
        // 1, 5, 13, 25, 41( 초기항이 1, 증가가 4*1, 4*2, 4*3...)
        // 1, 2, 6, 7, 15, 16, 28
        // 1+4+1+8+1+12+16+1
        // 홀수번째로 더할땐 이전항+1, 짝수번째로 더할땐 4*1 계차
        // 1/1, 2/2, 3/3, 4/4, 5/5
        int add1 = 1;
        int add2 = 0;
        int idx = 1;
        int target = Integer.parseInt(br.readLine());
        int seq1 = 0;
        int seq2 = 0;
        int a = 1, b = 0;
        int before1 = 1;
        int before2 = 1;
        int diff = 0;
        while (true) {
            if (target == 1) {
                b = 1;
                diff = 0;
                break;
            }
            else if(target == 2) {
                a = 2;
                b = 1;
                diff = -1;
                break;
            }
            else if(target == 3) {
                b = 2;
                diff = 1;
                break;
            }
            if (idx % 2 == 1) { // 홀수면
                seq1 = before1 + 1;
                seq2 = before2 + (2 + (4 * add2++));
            } else { // 짝수면
                seq1 = before1 + (4 * add1++);
                seq2 = before2 + 1;
            }
            before1 = seq1; // 이전값으로 초기화
            before2 = seq2;
            int small = Math.min(seq1, seq2);
            int big = Math.max(seq1,seq2);
            if (idx%2==1 && seq1 <= target && target <= seq2) { // 홀수면서
//                System.out.printf("seq1(%d) <= target(%d) <= seq2(%d)\n",
//                    small, target, big);
                diff = seq1 - target;
                break;
            }
            else if (idx%2 == 0 && seq2 <= target && target <= seq1) {
//                System.out.printf("seq2(%d) <= target(%d) <= seq1(%d)\n",
//                    small, target, big);
                diff = seq1 - target;
                break;
            }
            idx++;
            b = idx + 1;
//            System.out.printf("idx = %d, seq1 = %d, seq2 = %d\n", idx, seq1, seq2);
//            System.out.printf("a = %d, b = %d\n\n", a, b);
        }
//        System.out.println("diff = " + diff);
        a += diff;
        b -= diff;
        System.out.println(a + "/" + b);
    }

}