package inflearn.kimtaewon1.b_array.a_bigernum;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-01
 */
public class Main {

    private static ArrayList<Integer> getBiggerBehind(
        int n, int[] arr
    ) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1])
                answer.add(arr[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        final int N = sc.nextInt();
        int[] intArr = new int[N];
        for (int i = 0; i < N; i++) {
            intArr[i] = sc.nextInt();
        }
        System.out.println(getBiggerBehind(N, intArr)
            .stream().map(Object::toString)
            .collect(Collectors.joining(" ")));
    }
}
