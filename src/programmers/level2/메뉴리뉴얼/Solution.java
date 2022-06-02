package programmers.level2.메뉴리뉴얼;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        assertArrayEquals(
            solution(new String[]{"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"}, new int[]{2, 3, 4}),
            new String[]{"AC", "ACDE", "BCFG", "CDE"});
//        assertArrayEquals(
//            solution(new String[]{"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"},
//                new int[]{2, 3, 5}),
//            new String[]{"ACD", "AD", "ADE", "CD", "XYZ"});
//        assertArrayEquals(
//            solution(new String[]{"XYZ", "XWY", "WXA"}, new int[]{2, 3, 4}),
//            new String[]{"WX", "XY"});
    }

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
//        queue.add("ABC");
//        queue.add("CBZ");
//        queue.add("TZV");
        queue.add("CDE");
        queue.add("ACDE");
        queue.add("BCFG");
        queue.add("AC");
        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    HashMap<String, Integer> map;
    int m;

    public String[] solution(String[] orders, int[] course) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (int k : course) { // 2,3,4
            map = new HashMap<>();
            m = 0;
            for (String order : orders) {
                find(0, "", k, 0, order);
            }
            System.out.println("m = " + m);
            for (Entry<String, Integer> entry : map.entrySet()) {
                System.out.printf("key = %s, value = %d\n", entry.getKey(), entry.getValue());
            }
            for (String s : map.keySet()) {
                if (map.get(s) == m && m > 1) {
                    pq.offer(s);
                }
            }
        }
        String[] answer = new String[pq.size()];
        int k = 0;
        while (!pq.isEmpty()) {
            answer[k++] = pq.poll();
        }
        return answer;
    }

    public void find(int cnt, String str, int targetNum, int idx, String word) {
        if (cnt == targetNum) {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            StringBuilder temps = new StringBuilder();
            for (char value : c) temps.append(value);
            map.put(temps.toString(), map.getOrDefault(temps.toString(), 0) + 1);
            m = Math.max(m, map.get(temps.toString()));
            return;
        }
        for (int i = idx; i < word.length(); i++) {
            char now = word.charAt(i);
            find(cnt + 1, str + now, targetNum, i + 1, word);
        }
    }
}