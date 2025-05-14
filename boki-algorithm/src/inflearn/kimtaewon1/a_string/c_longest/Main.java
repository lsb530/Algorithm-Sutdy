package inflearn.kimtaewon1.a_string.c_longest;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-03
 */
public class Main {

    private static String longestWord(String[] words) {
        String answer = words[0];
        int maxSize = words[0].length();
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxSize) {
                maxSize = words[i].length();
                answer = words[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        System.out.println(longestWord(words));
    }
}
