package boj.bronze.bronzeV;

import java.util.Scanner;

public class p5554 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int second = Integer.parseInt(scanner.nextLine());
            sum += second;
        }
        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}