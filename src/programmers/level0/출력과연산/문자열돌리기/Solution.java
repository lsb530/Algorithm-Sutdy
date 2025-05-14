package programmers.코딩기초트레이닝.출력과연산.문자열돌리기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char c : a.toCharArray()) {
            System.out.println(c);
        }
    }
}