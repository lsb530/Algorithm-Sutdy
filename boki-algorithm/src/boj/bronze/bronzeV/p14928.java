package boj.bronze.bronzeV;

import java.math.BigInteger;
import java.util.Scanner;

public class p14928 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 이렇게로도 해결이 안된다.
        //        BigInteger input = scanner.nextBigInteger();
//        System.out.println(input.mod(BigInteger.valueOf(20000303L)));
        // 직접 1문 자씩 쪼개서 나머지 연산을 해서 더해준다
        String data = scanner.nextLine();
        long remain = 0;
        for (int i = 0; i < data.length(); i++) {
            remain = (remain * 10 + (data.charAt(i) - '0')) % 20000303L;
        }
        System.out.println(remain);

    }
}