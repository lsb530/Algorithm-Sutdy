package programmers.level2.뉴스클러스터링;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
//        Assertions.assertEquals(solution("FRANCE", "french"), 16384);
//        Assertions.assertEquals(solution("handshake", "shake hands"), 65536);
//        Assertions.assertEquals(solution("aa1+aa2", "AAAA12"), 43690);
//        Assertions.assertEquals(solution("E=M*C^2", "e=m*c^2"), 65536);
        Assertions.assertEquals(solution("abc", "abbb"), 16384);
//        Assertions.assertEquals(solution("aabbc", "abbde"), 16384);
    }

    public int solution(String str1, String str2) {
        ArrayList<String> group1 = new ArrayList<>();
        ArrayList<String> group2 = new ArrayList<>();
        addGroup(str1, group1);
        addGroup(str2, group2);
        HashMap<String, Integer> group1Cnt = new HashMap<>();
        HashMap<String, Integer> group2Cnt = new HashMap<>();
        computeCnt(group1, group1Cnt);
        computeCnt(group2, group2Cnt);
        HashSet<String> sameString = new HashSet<>();
        for (String s : group1) {
            for (String v : group2) {
                if(s.equals(v)) sameString.add(s);
            }
        }
        ArrayList<String> interGroup = new ArrayList<>();
        ArrayList<String> sumGroup = new ArrayList<>();
        for (Entry<String, Integer> entry : group1Cnt.entrySet()) {
            if (sameString.contains(entry.getKey())) {
                int min = Math.min(group1Cnt.get(entry.getKey()), group2Cnt.get(entry.getKey()));
                int max = Math.max(group1Cnt.get(entry.getKey()), group2Cnt.get(entry.getKey()));
                for (int i = 0; i < min; i++) {
                    interGroup.add(entry.getKey());
                }
                for (int i = 0; i < max; i++) {
                    sumGroup.add(entry.getKey());
                }
            } else {
                sumGroup.add(entry.getKey());
            }
        }
        for (String s : group2) {
            if(sameString.contains(s)) continue;
            sumGroup.add(s);
        }
//        System.out.println("-");
//        System.out.println(interGroup.size());
//        System.out.println(sumGroup.size());

        if(interGroup.size() == sumGroup.size()) return 65536;
        return (int) (interGroup.size() / (double) sumGroup.size() * 65536);
    }

    private void computeCnt(ArrayList<String> group, HashMap<String, Integer> groupCnt) {
        for (String s : group) {
            groupCnt.put(s, groupCnt.getOrDefault(s,0) + 1);
        }
    }

    private void addGroup(String str, ArrayList<String> group) {
        for (int i = 0; i < str.length() - 1; i++) {
            String subStr = str.substring(i, i + 2);
            boolean matches = subStr.matches("^[A-Z|a-z]*$");
            if(matches) group.add(subStr.toLowerCase());
        }
    }
}