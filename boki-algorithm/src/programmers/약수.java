package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class 약수 {
    public static List<Integer> getDivisors(int N) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i * i <= N; i++) {
            if (i * i == N) {
                result.add(i);
            }
            else if (N % i == 0) {
                result.add(i);
                result.add(N / i);
            }
        }
        result.sort(Comparator.naturalOrder());
        return result;
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i=left; i <= right; i++) {
            List<Integer> divisors = getDivisors(i);
            answer = divisors.size() % 2 == 0 ? answer + i : answer - i;
        }
        return answer;
    }

    public static void main(String[] args) {
//        List<Integer> divisors = getDivisors(14);
//        System.out.println("divisors = " + divisors);
        int solution = solution(13, 17);
        System.out.println("solution = " + solution);
    }
}
