package boj.bronze.bronzeV;

import java.util.Scanner;

public class p15439 {

    public static void main(String[] args) {
        // 경우의 수. 상의 n개의 종류, 하의 n개의 종류면
        // 깔맞춤 피하려면 (상의 n 경우) X (하의 n-1 (:상의색 제외)) 여야 함.
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println(i * (i - 1));
    }
}