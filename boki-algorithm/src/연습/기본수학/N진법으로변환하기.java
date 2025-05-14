package 연습.기본수학;

import java.util.Scanner;

public class N진법으로변환하기 {

    public static void main(String[] args) {
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Scanner sc = new Scanner(System.in);
        System.out.print("변환하고 싶은 10진수와, N진수(2~16) 입력: ");
        int decimal = sc.nextInt();
        int to = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            sb.append(dchar.charAt(decimal % to));
            decimal /= to;
        }
        sb.reverse();
        System.out.println(sb);
    }
}