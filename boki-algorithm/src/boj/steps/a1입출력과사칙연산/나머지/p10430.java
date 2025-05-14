package boj.steps.a1입출력과사칙연산.나머지;

import java.util.ArrayList;
import java.util.Scanner;

public class p10430 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }
        Integer a = list.get(0);
        Integer b = list.get(1);
        Integer c = list.get(2);
        System.out.println((a + b) % c);
        System.out.println(((a % c) + (b % c)) % c);
        System.out.println((a * b) % c);
        System.out.println(((a % c) * (b % c)) % c);
    }
}