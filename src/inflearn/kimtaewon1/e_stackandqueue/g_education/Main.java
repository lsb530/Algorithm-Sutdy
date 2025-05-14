package inflearn.kimtaewon1.e_stackandqueue.g_education;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/05-07
 */
public class Main {

    private static boolean checkEssentialCourses(String essentialCourses, String applyCourses) {
        Queue<Character> queue = new ArrayDeque<>();
        for (char c : essentialCourses.toCharArray()) {
            queue.offer(c);
        }
        for (char c : applyCourses.toCharArray()) {
            if (queue.contains(c)) {
                if (c != queue.poll()) return false;
            }
        }
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(checkEssentialCourses(a, b) ? "YES" : "NO");
    }

}
