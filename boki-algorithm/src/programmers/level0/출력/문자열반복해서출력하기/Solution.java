package programmers.코딩기초트레이닝.출력.문자열반복해서출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.print(str);
        }
    }
}