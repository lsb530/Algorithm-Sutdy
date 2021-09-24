package boj.bronze.bronzeV;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class p15727 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal d = scanner.nextBigDecimal();
        BigDecimal divide = d.divide(BigDecimal.valueOf(5), RoundingMode.CEILING);
        System.out.println(divide);
//        BigInteger distance = scanner.nextBigInteger();
//        distance.divide(BigInteger.valueOf(5));
//        System.out.println(divide.longValue());
    }
}