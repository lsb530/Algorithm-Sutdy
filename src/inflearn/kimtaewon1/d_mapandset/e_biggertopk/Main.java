package inflearn.kimtaewon1.d_mapandset.e_biggertopk;

import java.util.*;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/04-05
 */
public class Main {

    private static int biggerTopK(int n, int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        ArrayList<Integer> numArrayList = new ArrayList<>(set);
        numArrayList.sort((a, b) -> b - a);
        if (numArrayList.size() >= k) {
            return numArrayList.get(k - 1);
        }
        return -1;
    }

    private static int solution(int n, int[] arr, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    treeSet.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
        System.out.println("max: " + treeSet.first());
        System.out.println("min: " + treeSet.last());
        int rank = 1;
        for (Integer x : treeSet) {
            if (rank == k) return x;
            rank++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println(biggerTopK(n, arr, k));
        System.out.println(solution(n, arr, k));
    }
}
