package programmers.a고득점Kit.greedy.d구명보트;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class 효율0점개씹망코드 {

    public static int solution(int[] people, int limit) {
        int answer = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int person : people) {
            arr.add(person);
        }
        while (!arr.isEmpty()) {
            Integer max = arr.stream().
                max(Comparator.naturalOrder()).get();
            Integer min = arr.stream().
                min(Comparator.naturalOrder()).get();
            if (max + min <= limit) {
                arr.remove((Integer) min);
            }
            answer++;
            arr.remove((Integer) max);
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