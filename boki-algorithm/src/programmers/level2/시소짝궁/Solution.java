package programmers.level2.시소짝궁;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

    public long solution(int[] weights) {
        Set<Integer> set = new HashSet<Integer>();
        for (int weight : weights) {
            set.add(weight);
        }
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        int idx = 0;
        for (Integer x : set) {
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 2; i <= 4; i++) {
                list.add(x * i);
            }
            map.put(idx++, list);
        }
        map.forEach((k, v) -> {
//            System.out.printf("key = %d, ", k);
//            System.out.println(v);
        });
//        System.out.println();
        Set<Integer> answerSet = new HashSet<Integer>();
        for (int i = 0; i < idx; i++) {
            List<Integer> curList = map.get(i);
//            System.out.println(i);
//            System.out.println("curList: " + curList);
            for (int j = 0; j < idx; j++) {
                if (i != j) {
//                    System.out.println(map.get(j));
                    List<Integer> diffList = map.get(j);
                    for (int k = 0; k < curList.size(); k++) {
                        Integer a = curList.get(k);
                        for (int l = 0; l < curList.size(); l++) {
                            Integer b = diffList.get(l);
//                            System.out.printf("a = %d, b = %d\n", a, b);
                            if (a.equals(b)) {
//                                System.out.println("여기");
                                answerSet.add(a);
                            }
                        }
                    }
                }
            }
//            System.out.println(map.get(i));
        }
        return answerSet.size() + weights.length - set.size();
//        System.out.println(answerSet.size() + weights.length - set.size());
//        long answer = 0;
//        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] weights = new int[]{100, 180, 360, 100, 270};
        System.out.println(sol.solution(weights));
    }
}
