package programmers.a고득점Kit.stackAndqueue.b프린터;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2;
        int sol1 = solution(priorities1, location1);
        System.out.println("sol1 = " + sol1);

        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;
        int sol2 = solution(priorities2, location2);
        System.out.println("sol2 = " + sol2);
    }

    public static int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 3 2 1 1
        int answer = 0;
        for (int i = 0; i < priorities.length; i++) {
            pq.add(priorities[i]);
        }
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                Integer peek = pq.peek();
                if (priorities[i] == peek) { // 3 == 3, i = 2
                    if (i == location) {
                        answer++; // 1
                        return answer; // 1
                    }
                    pq.poll(); //
                    answer++;
                }
            }
        }
        return -1;
    }
}