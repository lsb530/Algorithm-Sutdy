package programmers.코딩기초트레이닝.출력.대소문자바꿔서출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char c : a.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.print(Character.toLowerCase(c));
            }
            else {
                System.out.print(Character.toUpperCase(c));
            }
        }
    }
}