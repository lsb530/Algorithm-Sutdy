package practice;

import java.util.Arrays;
import java.util.Scanner;

public class 소수찾기에라토스테네스의체 {

    static boolean[] prime;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 n까지의 소수를 모두 출력합니다\nn: ");
        int N = Integer.parseInt(sc.nextLine());
        prime = new boolean[N + 1];
        Eratostenes(N);
        for (int i = 0; i < prime.length; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void Eratostenes(int num) {
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
//        for (int i = 2; i * i <= num; i += 1) {
        for (int i = 2; i * i <= num; i++) {
            for (int j = i * i; j <= num; j += i) {
//            for (int j = i * i; j <= num; j++) {
                prime[j] = false;        //2를 제외한 2의 배수 false
            }
        }
    }
}