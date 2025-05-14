package inflearn.kimtaewon1.e_stackandqueue.f_princess;

import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/05-06
 */
public class Main {

    private static int prince(int N, int K) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        int cnt = 1;
        int answer = 0;
        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                answer = queue.poll();
                break;
            }
            if (cnt % K != 0) {
                queue.offer(queue.poll());
            }
            else {
               queue.poll();
            }
            cnt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println(prince(N, K));
    }
}
