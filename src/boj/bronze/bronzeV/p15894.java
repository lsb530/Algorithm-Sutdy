package boj.bronze.bronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class p15894 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger n = scanner.nextBigInteger();
        System.out.println(n.multiply(BigInteger.valueOf(4)));
    }
}