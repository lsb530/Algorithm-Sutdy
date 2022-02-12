package programmers.level1.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Solution {

    public static void main(String[] args) {
        String[] participants1 = new String[]{"leo", "kiki", "eden"};
        String[] completion1 = new String[]{"eden", "kiki"};
        String sol1 = solution(participants1, completion1);
        System.out.println("sol1 = " + sol1);

        String[] participants2 = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion2 = new String[]{"josipa", "filipa", "marina", "nikola"};
        String sol2 = solution(participants2, completion2);
        System.out.println("sol2 = " + sol2);

        String[] participants3 = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion3 = new String[]{"stanko", "ana", "mislav"};
        String sol3 = solution(participants3, completion3);
        System.out.println("sol3 = " + sol3);
    }

    public static String solution(String[] participant, String[] completion) {
        Map<String, Integer> people = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            people.put(participant[i], people.getOrDefault(participant[i], 0) + 1);
        }
        for (int i = 0; i < completion.length; i++) {
            people.put(completion[i], people.getOrDefault(completion[i], 0) - 1);
        }
        String answer = "";
        for (Entry<String, Integer> entry : people.entrySet()) {
            if(entry.getValue() == 0) continue;
            answer = entry.getKey();
        }
        return answer;
    }
}