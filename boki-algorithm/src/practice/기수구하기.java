package practice;

import java.util.Scanner;

public class 기수구하기 {

    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);
        return digits - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("10진수 입력: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("변환하고 싶은 진수 입력: ");
        int r = Integer.parseInt(sc.nextLine());
        char[] d = new char[32];
        int len = cardConvR(x, r, d);
        for (int i = len; i >= 0; i--) {
            char c = d[i];
            System.out.print(c);
        }
    }
}