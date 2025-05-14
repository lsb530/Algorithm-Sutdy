package programmers.level1.모의고사;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

    }

    public static int[] solution(int[] answer) {
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int max = Integer.MIN_VALUE;
        int[] cnt = new int[3];
        for (int i = 0; i < answer.length; i++) {
            if(answer[i] == p1[i%p1.length]) cnt[0]++;
            if(answer[i] == p2[i%p2.length]) cnt[1]++;
            if(answer[i] == p3[i%p3.length]) cnt[2]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            max = Math.max(max, cnt[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max) ans.add(i+1);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}