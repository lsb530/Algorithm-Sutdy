package inflearn.kimtaewon1.a_string.d_flipword;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-04
 */
public class Main {

    private static String flipStr(String str) {
        StringBuilder answer = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            answer.append(charArray[i]);
        }
        return answer.toString();
    }

    private static ArrayList<String> flipStrPointer(String[] sentences) {
        ArrayList<String> answer = new ArrayList<>();
        for (String sentence : sentences) {
            char[] charArray = sentence.toCharArray();
            int lt = 0;
            int rt = charArray.length - 1;
            while (lt < rt) {
                char temp = charArray[lt];
                charArray[lt] = charArray[rt];
                charArray[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(charArray));
        }
        return answer;
    }

    private static String flipSimple(String str) {
        StringBuilder answer = new StringBuilder(str);
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] inputs = new String[N];
        for (int i = 0; i < N; i++) {
            inputs[i] = sc.next();
        }
        for (String s : flipStrPointer(inputs)) {
            System.out.println(s);
        }
        // for (int i = 0; i < N; i++) {
            // System.out.println(flipStr(inputs[i]));
            // System.out.println(flipSimple(inputs[i]));
        // }
    }
}
