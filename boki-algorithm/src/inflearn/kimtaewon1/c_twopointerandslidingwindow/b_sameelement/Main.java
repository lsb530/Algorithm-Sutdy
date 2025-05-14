package inflearn.kimtaewon1.c_twopointerandslidingwindow.b_sameelement;

import java.util.*;

import static java.lang.System.in;

public class Main {
    private static List<Integer> getSameElements( // MAX: 30_000*30_000 = 900,000,000 -> 시간초과
        int n, int m,
        int[] arr1, int[] arr2
    ) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) answer.add(i);
            }
        }
        Collections.sort(answer);
        return answer;
    }

    private static List<Integer> getSameElementsByTwoPointer(
        int n, int m,
        int[] arr1, int[] arr2
    ) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if (arr1[p1] < arr2[p2])
                p1++;
            else
                p2++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();
        // getSameElements(n, m, arr1, arr2)
        getSameElementsByTwoPointer(n, m, arr1, arr2)
            .forEach(x -> System.out.print(x + " "));
    }
}
