package programmers.a고득점Kit.hash.c위장;

import java.util.HashMap;
import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {
        String[][] clothes1 = {{"yellowhat", "headgear"}, {"bluesunglasses", "e yewear"},
            {"green_turban", "headgear"}};
        int sol1 = solution(clothes1);
        System.out.println(sol1);
        String[][] clothes2 = {{"crowmask", "face"}, {"bluesunglasses", "face"},
            {"smoky_makeup", "face"}};
        int sol2 = solution(clothes2);
        System.out.println(sol2);
    }

    public static int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        Iterator<Integer> valueIter = map.values().iterator();
        int answer = 1;
        // 아무것도 입지 않은 경우를 추가해서 곱해줌
        while (valueIter.hasNext()) {
            answer *= valueIter.next() + 1;
        }
        // 경우의 수에서 모든 옷을 안 입은 경우의 수를 빼줌
        return answer - 1;
    }
}