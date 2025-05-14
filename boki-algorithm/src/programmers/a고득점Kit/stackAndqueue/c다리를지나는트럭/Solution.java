package programmers.a고득점Kit.stackAndqueue.c다리를지나는트럭;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        int bridge_length1 = 2;
        int weight1 = 10;
        int[] truck_weights1 = {7, 4, 5, 6};
        int sol1 = solution(bridge_length1, weight1, truck_weights1);
        System.out.println(sol1);

        int bridge_length2 = 100;
        int weight2 = 100;
        int[] truck_weights2 = {10};
        int sol2 = solution(bridge_length2, weight2, truck_weights2);
        System.out.println(sol2);

        int bridge_length3 = 100;
        int weight3 = 100;
        int[] truck_weights3 = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int sol3 = solution(bridge_length3, weight3, truck_weights3);
        System.out.println(sol3);
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        int max = 0;
        // 1. 큐가 비어있으면 트럭의 무게를 넣는다
        // 2. 트럭이 다리를 다 지났으면, 큐의 크기는 다리와 동일하므로 큐에서 꺼내 최대 무게에서 빼줌
        // 3. 큐가 비어있지않고, 무게가 초과될때 0을 넣는다
        // 4. 큐가 비어있지않고, 무게가 충분할때 트럭의 무게를 넣는다
        for (int w : truck_weights) {
            while (true) {
                if (q.isEmpty()) {
                    q.offer(w);
                    max += w;
                    answer++;
                    break;
                } else if (q.size() == bridge_length) {
                    max -= q.poll();
                } else {
                    if (max + w > weight) {
                        q.offer(0);
                        answer++;
                    } else {
                        q.offer(w);
                        max += w;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }
}