package boj.steps.a8기본수학1;

import java.util.Scanner;

public class p2292벌집 {

    public static void main(String[] args) {
        // 1, 7, 19, 37, 61
        // 0, 6, 18, 36, 60
        // 0, 6*1, 6*3, 6*6 6*10
        // 0, 1, 3, 6, 10
        //  1  2  3  4
        // 최초가 0이고 n씩 증가하는 계차수열
        int seq = 0;
        int l = 0; // 초깃값
        int k = 1; // 증가
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int answer = 1;
        while (true) {
            l = l + k++;
            long x = 6L * seq + 1;
//            System.out.println(x);
            if (target <= x) {
                break;
            } else {
                answer++;
            }
            seq = l;
        }
        System.out.println(answer);
    }

}