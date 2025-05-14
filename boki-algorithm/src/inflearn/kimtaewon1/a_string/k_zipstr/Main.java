package inflearn.kimtaewon1.a_string.k_zipstr;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-11
 */
public class Main {

    private static String zipStr(String str) {
        StringBuilder sb = new StringBuilder();
        int x = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                x++;
            }
            else {
                sb.append(str.charAt(i));
                if (x > 1) {
                    sb.append(x);
                }
                x = 1;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(zipStr(str + " "));
    }

}
