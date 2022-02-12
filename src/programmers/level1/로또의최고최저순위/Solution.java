package programmers.level1.로또의최고최저순위;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] lottos1 = {44, 1, 0, 0, 31, 25};
        int[] win_nums1 = {31, 10, 45, 1, 6, 19};
        int[] sol1 = solution(lottos1, win_nums1);
        System.out.println(Arrays.toString(sol1));
        int[] lottos2 = {0, 0, 0, 0, 0, 0};
        int[] win_num2 = {38, 19, 20, 40, 15, 25};
        int[] sol2 = solution(lottos2, win_num2);
        System.out.println(Arrays.toString(sol2));
        int[] lottos3 = {45, 4, 35, 20, 3, 9};
        int[] win_num3 = {20, 9, 3, 45, 4, 35};
        int[] sol3 = solution(lottos3, win_num3);
        System.out.println(Arrays.toString(sol3));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] rank = {6, 5, 4, 3, 2, 1};
        Set<Integer> answerSet = new HashSet<>();
        int zero = 0;
        for (int i = 0; i < win_nums.length; i++) {
            answerSet.add(win_nums[i]);
        }
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] != 0) {
                answerSet.remove(lottos[i]);
                continue;
            }
            zero++;
        }
        int low = 6 - answerSet.size(); // 맞춘 개수
        int high = low + zero;
        int[] answer = new int[2];
        answer[0] = (high - 1 < 0) ? rank[0] : rank[high - 1];
        answer[1] = (low - 1 < 0) ? rank[0] : rank[low - 1];
        return answer;
    }
}