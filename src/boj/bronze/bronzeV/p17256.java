package boj.bronze.bronzeV;

import java.util.Scanner;

public class p17256 {

    public static void main(String[] args) {
        // a^b = (a.z + b.x, a.y * b.y, a.x + b.z)
        // a ^ b = c
        // a = 15 16 17 / b = ? ? ? / c = 19 32 90
        // (19, 32, 90) = (17 + b.x, 16 * b.y, 15 + b.z)
        // (19 - (17 + b.x), 32 - (16 * b.y), 90 - (15 + b.z))
        // 19 = 17 + b.x => b.x = 19-17 => b.x = c.x - a.z
        // 32 = 16 * b.y => b.y = 32/16 => b.y = c.y / a.y
        // 90 = 15 + b.z => b.z = 90-15 => b.z = c.z - a.x
        Scanner scanner = new Scanner(System.in);
        int[] arrA = new int[3];
        int[] arrB = new int[3];
        int[] arrC = new int[3];
        for (int i = 0; i < 3; i++) {
            arrA[i] = scanner.nextInt();
        }
        for (int i = 0; i < 3; i++) {
            arrC[i] = scanner.nextInt();
        }
        arrB[0] = arrC[0] - arrA[2];
        arrB[1] = arrC[1] / arrA[1];
        arrB[2] = arrC[2] - arrA[0];
        System.out.println(arrB[0] + " " + arrB[1] + " " + arrB[2]);
    }
}