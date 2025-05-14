package inflearn.kimtaewon1.b_array.h_rank;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-08
 */
public class Main {

    private static ArrayList<Integer> getRanksFrom(int[] scores) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            int rank = 1;
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] < scores[j]) {
                    rank++;
                }
            }
            answer.add(rank);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        String answer = getRanksFrom(scores)
            .stream().map(Objects::toString)
            .collect(Collectors.joining(" "));
        System.out.println(answer);
    }
}
