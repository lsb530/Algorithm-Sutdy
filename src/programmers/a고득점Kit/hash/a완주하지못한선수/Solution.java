package programmers.a고득점Kit.hash.a완주하지못한선수;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        String[] participant1 = {"leo", "kiki", "eden"};
        String[] completion1 = {"eden", "kiki"};
        String ans1 = solution(participant1, completion1);
        System.out.println(ans1);
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String ans2 = solution(participant2, completion2);
        System.out.println(ans2);
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = {"stanko", "ana", "mislav"};
        String ans3 = solution(participant3, completion3);
        System.out.println(ans3);
    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> people = new HashMap<>();
        for (String p : participant) {
            people.put(p, people.getOrDefault(p, 0) + 1);
        }
        for (String c : completion) {
            people.put(c, people.get(c) - 1);
        }
        for (Entry<String, Integer> set : people.entrySet()) {
            if (set.getValue() != 0) {
                answer = set.getKey();
                break;
            }
        }
        return answer;
    }
}