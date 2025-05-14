package boj.bronze.bronzeV;

import java.util.Scanner;

public class p6749 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b1 = Integer.parseInt(scanner.nextLine());
        int b2 = Integer.parseInt(scanner.nextLine());
        System.out.println(b2 + (b2 - b1));
    }
}