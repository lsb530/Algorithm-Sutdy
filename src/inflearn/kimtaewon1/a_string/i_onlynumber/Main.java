package inflearn.kimtaewon1.a_string.i_onlynumber;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-09
 */
public class Main {

    private static int toNumber(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c))
                sb.append(c);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(toNumber(input));
    }

}
