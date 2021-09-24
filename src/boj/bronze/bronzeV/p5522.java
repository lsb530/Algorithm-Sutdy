package boj.bronze.bronzeV;

import java.util.Scanner;

public class p5522 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int data = Integer.parseInt(scanner.nextLine());
            sum += data;
        }
        System.out.println(sum);
    }
}