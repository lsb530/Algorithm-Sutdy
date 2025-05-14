package inflearn.kimtaewon1.d_mapandset.c_kindsofsales;

import java.util.*;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/04-03
 */
public class Main {

    // Timeout
    private static ArrayList<Integer> getKindsOfSales(int n, int k, int[] sales) {
        ArrayList<Integer> answer = new ArrayList<>();
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < k; i++)
            queue.add(sales[i]);
        answer.add(new HashSet<>(queue).size());

        for (int i = k; i < n; i++) {
            queue.pollFirst();
            queue.offerLast(sales[i]);
            answer.add(new HashSet<>(queue).size());
        }

        return answer;
    }

    private static ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k - 1; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt]) - 1);
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] sales = new int[n];
        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }
        for (int x : solution(n, k, sales)) System.out.print(x + " ");
    }

}
