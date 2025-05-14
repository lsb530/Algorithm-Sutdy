package boj.bronze.bronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class p8437 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger b1 = scanner.nextBigInteger();
        BigInteger b2 = scanner.nextBigInteger();
        BigInteger a1 = b1.subtract(b2).divide(BigInteger.valueOf(2));
        System.out.println(a1.add(b2));
        System.out.println(a1);
//        int totalApple = Integer.parseInt(scanner.nextLine());
//        int diff = Integer.parseInt(scanner.nextLine());
//        // x + (x + diff) = totalApple
//        // x + (x + 2) = 10
//        // 2x + 2 = 10
//        // 2x = 8
//        // x = 4
//        // 2x + diff = totalApple
//        // 2x = totalApple - diff
//        // x = (totalApple - diff) / 2
//        int apple1 = (totalApple - diff) / 2;
//        System.out.println(apple1 + diff);
//        System.out.println(apple1);
    }
}