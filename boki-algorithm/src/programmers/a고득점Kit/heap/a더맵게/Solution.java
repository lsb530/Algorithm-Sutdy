package programmers.a고득점Kit.heap.a더맵게;

import java.util.PriorityQueue;

public class Solution {

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int sol = solution(scoville, K);
        System.out.println("sol = " + sol);
    }

    public static int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int answer = 0;
        for (int i : scoville) {
            heap.add(i);
        }
        while(heap.peek() <= K) {
            if(heap.size() == 1) return -1;
            heap.add(heap.poll() + (heap.poll()) * 2);
            answer++;
        }
        return answer;
    }
}