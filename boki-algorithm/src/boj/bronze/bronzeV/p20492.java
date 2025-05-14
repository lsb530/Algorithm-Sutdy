package boj.bronze.bronzeV;

import java.math.BigDecimal;
import java.util.Scanner;

public class p20492 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal input = scanner.nextBigDecimal();
        BigDecimal first = input.multiply(BigDecimal.valueOf(0.78));
        BigDecimal mid = input.subtract(input.multiply(BigDecimal.valueOf(0.2)));
        BigDecimal dd = input.multiply(BigDecimal.valueOf(0.2));
        BigDecimal multiply = dd.multiply(BigDecimal.valueOf(0.78));
        BigDecimal add = mid.add(multiply);
        System.out.println(first.intValue() + " " + add.intValue());
    }
}