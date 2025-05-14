package inflearn.kimtaewon1.a_string.l_password;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-12
 */
public class Main {

    private static Character decrpyt(String str) {
        // 이진수변환(#->1, *->0)
        str = str.replace('#', '1');
        str = str.replace('*', '0');
        // 2진수 -> 10진수변환
        int parsedDecimal = Integer.parseInt(str, 2);
        // 10진수 -> 아스키변환
        return (char) parsedDecimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int ENCRYPT_PASSWORD_TOKEN = 7;
        int encryptCount = Integer.parseInt(sc.nextLine());
        String encryptStr = sc.nextLine().trim();
        for (int i = 0; i < ENCRYPT_PASSWORD_TOKEN * encryptCount; i += ENCRYPT_PASSWORD_TOKEN) {
            System.out.print(decrpyt(encryptStr.substring(i, i + ENCRYPT_PASSWORD_TOKEN)));
        }
    }

}
