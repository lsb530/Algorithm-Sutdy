package boj.bronze.bronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class p16394 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger year = scanner.nextBigInteger();
        System.out.println(year.subtract(BigInteger.valueOf(1946)));
    }
}