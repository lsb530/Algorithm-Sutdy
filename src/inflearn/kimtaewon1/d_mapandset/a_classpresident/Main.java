package inflearn.kimtaewon1.d_mapandset.a_classpresident;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/04-01
 */
public class Main {

    private static Character electClassPresident(int n, char[] votes) {
        HashMap<Character, Integer> classPresidentVotesMap = new HashMap<>();
        int maxVoteCount = Integer.MIN_VALUE;
        for (char c : votes) {
            Integer voteCount = classPresidentVotesMap.getOrDefault(c, 0);
            classPresidentVotesMap.put(c, voteCount + 1);
            maxVoteCount = Math.max(maxVoteCount, classPresidentVotesMap.get(c));
        }
        for (char c : votes) {
            if (maxVoteCount == classPresidentVotesMap.get(c)) {
                return c;
            }
        }
        return votes[0];
    }

    private static char getClassPresident(int n, String votes) {
        char answer = votes.charAt(0);
        Map<Character, Integer> map = new HashMap<>();
        for (char x : votes.toCharArray())
            map.put(x, map.getOrDefault(x, 0) + 1);
        int max = Integer.MIN_VALUE;
        for (char x : map.keySet()) {
            if (max < map.get(x)) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        String str = sc.next();
        // System.out.println(electClassPresident(n, str.toCharArray()));
        System.out.println(getClassPresident(n, str));
    }

}
