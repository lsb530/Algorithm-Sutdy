package inflearn.kimtaewon1.a_string.e_flipalphaword;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-05
 */
public class Main {

    private static String flipOnlyAlpha(String input) {
        char[] charArray = input.toCharArray();
        int lt = 0;
        int rt = charArray.length - 1;
        while (lt <= rt) {
            if (!Character.isAlphabetic(charArray[lt])) lt++;
            else if (!Character.isAlphabetic(charArray[rt])) rt--;
            else {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(flipOnlyAlpha(input));
    }

}
