package inflearn.kimtaewon1.a_string.a_findch;

import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-01
 */
public class Main {
    private static int solution(String str, char findChar) {
        int answer = 0;
        for (char c : str.toUpperCase().toCharArray()) {
            if (c == findChar)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char findChar = Character.toUpperCase(sc.nextLine().charAt(0));

        System.out.println(solution(input, findChar));
    }
}
