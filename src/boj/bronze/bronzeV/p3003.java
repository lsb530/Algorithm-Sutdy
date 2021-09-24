package boj.bronze.bronzeV;

import java.util.ArrayList;
import java.util.Scanner;

public class p3003 {

    public static void main(String[] args) {
        int[] chess = {1, 1, 2, 2, 2, 8};
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(scanner.nextInt());
        }
        for (int i = 0; i < chess.length; i++) {
            System.out.printf("%d ", chess[i] - list.get(i));
        }
    }
}