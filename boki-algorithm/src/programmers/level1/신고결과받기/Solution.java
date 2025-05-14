package programmers.level1.신고결과받기;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k1 = 2;
        solution(id_list1, report1, k1);

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        solution(id_list2, report2, k2);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportMap = new LinkedHashMap<>();
        for (String s : id_list) {
            reportMap.put(s, new HashSet<>());
        }
        for (String rep : report) {
            String[] ids = rep.split(" ");
            String from = ids[0], to = ids[1];
            reportMap.get(from).add(to);
        }
        HashMap<String, Integer> nameCnt = new HashMap<>();
        for (Entry<String, Set<String>> entry : reportMap.entrySet()) {
            for (String n : entry.getValue()) {
                nameCnt.put(n, nameCnt.getOrDefault(n,0) + 1);
            }
        }
        int[] arr = new int[id_list.length];
        int i = 0;
        for (Entry<String, Set<String>> entry : reportMap.entrySet()) {
            int cnt = 0;
            for (String n : entry.getValue()) {
                if (nameCnt.get(n) >= k) {
                    cnt++;
                }
            }
            arr[i] = cnt;
            i++;
        }
        return arr;
    }
}