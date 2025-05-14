package inflearn.kimtaewon1.a_string.b_transcase;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-02
 */
public class Main {
    private static String transCase(String input) {
        StringBuilder answer = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLowerCase(c))
                answer.append(Character.toUpperCase(c));
            else
                answer.append(Character.toLowerCase(c));
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(transCase(input));
    }
}
