package programmers.코딩기초트레이닝.출력과연산.홀짝구분하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("%d is %s\n", n, n % 2 == 0 ? "even" : "odd");
    }
}