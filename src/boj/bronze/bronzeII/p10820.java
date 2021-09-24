package boj.bronze.bronzeII;

import java.io.IOException;
import java.util.Scanner;

public class p10820 {
    // 첫째 줄부터 N번째 줄까지 각각의 문자열에 대해서
    // 소문자, 대문자, 숫자, 공백의 개수를 공백으로 구분해 출력한다.
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            int lower = 0, upper = 0, num = 0, space = 0;
            String s = sc.nextLine();
            int count = s.length();
            for (int i = 0; i < count; i++) {
                char c = s.charAt(i); // 현재
                for (int j = 'a'; j <= 'z'; j++) {
                    if (c == j) lower++;
                }
                for (int j = 'A'; j <= 'Z'; j++) {
                    if (c == j) upper++;
                }
                for (int j = 0; j < 10; j++) {
                    if ((c - '0') == j) num++;
                }
            }
            space = count - (lower + upper + num);
            System.out.println(lower + " " + upper + " " + num + " " + space);
        }
    }

}