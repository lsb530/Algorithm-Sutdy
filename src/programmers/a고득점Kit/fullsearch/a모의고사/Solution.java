package programmers.a고득점Kit.fullsearch.a모의고사;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static int[] solution(int[] answers) {
        List<Integer> ans = new ArrayList<>();
        int[] p1 = {1, 2, 3, 4, 5};
        int[] p2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] p3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] cnt = new int[3];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < answers.length; i++) {
            if(p1[i%p1.length] == answers[i]) cnt[0]++;
            if(p2[i%p2.length] == answers[i]) cnt[1]++;
            if(p3[i%p3.length] == answers[i]) cnt[2]++;
        }
        for (int i = 0; i < cnt.length; i++) {
            max = Math.max(cnt[i], max);
        }
        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max && cnt[i] != Integer.MIN_VALUE) ans.add(i+1);
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] answers1 = {1, 2, 3, 4, 5};
        int[] sol1 = solution(answers1);
        for (int i : sol1) {
            System.out.println("i = " + i);
        }
        int[] answers2 = {1, 3, 2, 4, 2};
        int[] sol2 = solution(answers2);
        for (int i : sol2) {
            System.out.println("i = " + i);
        }
        int[] answers3 = {5,4,1};
        int[] sol3 = solution(answers3);
        for (int i : sol3) {
            System.out.println("i = " + i);
        }
    }
}