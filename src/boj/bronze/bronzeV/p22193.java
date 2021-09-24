package boj.bronze.bronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class p22193 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        BigInteger x = scanner.nextBigInteger();
        BigInteger y = scanner.nextBigInteger();
        System.out.println(x.multiply(y));
    }
}