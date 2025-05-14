package boj.bronze.bronzeV;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class p2845 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger l = scanner.nextBigInteger();
        BigInteger p = scanner.nextBigInteger();
        BigInteger area = l.multiply(p);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d ", list.get(i) - area.intValue());
        }
    }
}