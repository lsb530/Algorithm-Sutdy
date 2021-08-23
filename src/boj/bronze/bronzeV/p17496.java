package boj.bronze.bronzeV;

import java.util.Scanner;

public class p17496 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int i = (arr[0] - 1) / arr[1] * arr[2] * arr[3];
        System.out.println(i);
    }
}