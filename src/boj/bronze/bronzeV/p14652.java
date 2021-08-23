package boj.bronze.bronzeV;

import java.util.Scanner;

public class p14652 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 3 * 4 = (세로 * 가로)
        int n = scanner.nextInt(); // 세로
        int m = scanner.nextInt(); // 가로
        int k = scanner.nextInt();
        // 입력 초과가 난다
//        int[][] arr = new int[n][m];
//        int x = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = x;
//                x++;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (k == arr[i][j]) {
//                    System.out.println(i + " " + j);
//                    break;
//                }
//            }
//        }
        System.out.println(k / m + " " + k % m);
    }
}