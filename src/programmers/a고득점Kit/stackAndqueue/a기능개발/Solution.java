package programmers.a고득점Kit.stackAndqueue.a기능개발;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        int[] progresses1 = {93, 30, 55};
        int[] speed1 = {1, 30, 5};
        int[] sol1 = solution(progresses1, speed1);
        for (int i : sol1) {
            System.out.println(i);
        }
        System.out.println();

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speed2 = {1, 1, 1, 1, 1, 1};
        int[] sol2 = solution(progresses2, speed2);
        for (int i : sol2) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> days = new ArrayDeque<>();
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < progresses.length; i++) {
            int day = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
            days.add(day);
        }
        int cnt = 1;
        int diff = 0;
        if (!days.isEmpty()) {
            diff = days.poll();
        }
        while(!days.isEmpty()) {
            int num = days.poll();
            if(diff >= num) {
                cnt++;
            }else {
                answer.add(cnt);
                cnt = 1;
                diff = num;
            }
        }
        answer.add(cnt);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}