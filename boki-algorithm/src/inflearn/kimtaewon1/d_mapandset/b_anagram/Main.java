package inflearn.kimtaewon1.d_mapandset.b_anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/04-02
 */
public class Main {

    private static boolean isAnagram(String a, String b) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : a.toCharArray())
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        for (char c : b.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        boolean isAnagram = true;
        for (char c : a.toCharArray()) {
            if (!map1.get(c).equals(map2.get(c))) {
                return false;
            }
        }
        return isAnagram;
    }

    private static String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        String a = sc.next();
        String b = sc.next();
        // System.out.println(isAnagram(a, b) ? "YES" : "NO");
        System.out.println(solution(a, b));
    }
}
