package programmers.a고득점Kit.greedy.d구명보트;

import java.util.Arrays;
import java.util.stream.Stream;

public class Solution {

    public static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int x = 0, y = people.length - 1;
        for (int i = 0; i < people.length; i++) {
            int min = people[x];
            int max = people[y];
            if (min + max <= limit) {
                x++;
                i++;
            }
            // max > limit || min + max > limit
            y--;
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] people1 = {70, 50, 80, 50};
        int limit1 = 100;
        int sol1 = solution(people1, limit1);
        System.out.println("sol1 = " + sol1);

        int[] people2 = {70, 80, 50};
        int limit2 = 100;
        int sol2 = solution(people2, limit2);
        System.out.println("sol2 = " + sol2);

        int[] people3 = Stream.iterate(1, n -> n + 1).limit(20).mapToInt(Integer::intValue)
            .toArray();
        int limit3 = 20;
        int sol3 = solution(people3, limit3);
        System.out.println("sol3 = " + sol3);

        int[] people4 = {1, 1, 1, 1, 1, 1, 1};
        int limit4 = 3;
        int sol4 = solution(people4, limit4);
        System.out.println("sol4 = " + sol4);
    }
}