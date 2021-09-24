package boj.steps.a2if문.사분면고르기;

import java.util.Scanner;

public class p14681 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[] four = {1,2,3,4};
        // 1사분면(+,+), 2사분면(-,+), 3사분면(-,-), 4사분면(+,-)
        if (a > 0 && b > 0) {
            System.out.println(four[0]);
        } else if (a < 0 && b > 0) {
            System.out.println(four[1]);
        } else if (a < 0 && b < 0) {
            System.out.println(four[2]);
        } else {
            System.out.println(four[3]);
        }
    }
}