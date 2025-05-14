package inflearn.kimtaewon1.a_string.j_shortestdistance;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/01-10
 */
public class Main {

    private static ArrayList<Integer> shortestDistance(String str, char ch) {
        int[] distanceArr = new int[str.length()];
        int find = 1000;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ch) {
                distanceArr[i] = 0;
                find = 0;
            }
            else {
                distanceArr[i] = ++find;
            }
        }
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c == ch) {
                distanceArr[i] = 0;
                find = 0;
            }
            else {
                distanceArr[i] = Math.min(distanceArr[i], ++find);
            }
        }
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < distanceArr.length; i++) {
            answer.add(distanceArr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = sc.next().charAt(0);
        StringBuilder answer = new StringBuilder();
        for (Integer i : shortestDistance(str, ch)) {
            answer.append(i).append(" ");
        }
        answer.deleteCharAt(answer.length() - 1);
        System.out.println(answer);
    }

}
