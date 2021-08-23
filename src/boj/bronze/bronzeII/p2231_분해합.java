package boj.bronze.bronzeII;

import java.util.Scanner;

public class p2231_분해합 {

    static int dividedSum(int x) {
        int sum = 0;
        sum += x;
        while(x > 0) {
            sum += x%10;
            x /= 10;
        }
        return sum;
    }

    public static int solution(int n) {
        for (int i = 1; i < n; i++) {
            int num = dividedSum(i);
//            System.out.printf("i = %d, num = %d\n", i, num);
//            System.out.println("num = " + num);
            if (num == n) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = solution(n);
        System.out.println(answer);
    }
}