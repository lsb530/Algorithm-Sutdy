package boj.steps.a1입출력과사칙연산.곱셈;

import java.util.Scanner;

public class p2588 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String data = scanner.nextLine();
        int mul = 1;
        int sum = 0;
        int i;
        for (i = data.length()-1; i >= 0; i--) {
            int b = data.charAt(i) - '0';
            int result = a * b;
            System.out.println(result);
            sum += (result * mul);
            mul *= 10;
        }
        System.out.println(sum);
    }
}