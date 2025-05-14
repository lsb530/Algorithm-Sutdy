package boj.bronze.bronzeV;

import java.util.Scanner;

public class p8370 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(arr[0] * arr[1] + arr[2] * arr[3]);
    }
}