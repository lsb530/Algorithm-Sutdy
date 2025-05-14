package inflearn.kimtaewon1.c_twopointerandslidingwindow.a_mergearray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    private static ArrayList<Integer> mergerTwoArray(
        int[] arr1,
        int[] arr2
    ) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int n : arr1) answer.add(n);
        for (int m : arr2) answer.add(m);
        Collections.sort(answer); // O(NlogN)
        return answer;
    }

    private static ArrayList<Integer> mergeTwoArrayByTwoPointer(
        int n, int m,
        int[] arr1, int[] arr2
    ) {
        int p1 = 0, p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        // p1 또는 p2가 하나라도 거짓이면 break
        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2])
                answer.add(arr1[p1++]);
            else
                answer.add(arr2[p2++]);
        }
        while (p1 < n) answer.add(arr1[p1++]);
        while (p2 < m) answer.add(arr2[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int j = 0; j < m; j++) {
            arr2[j] = sc.nextInt();
        }
        // for (Integer x : mergerTwoArray(arr1, arr2)) {
        for (Integer x : mergeTwoArrayByTwoPointer(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
