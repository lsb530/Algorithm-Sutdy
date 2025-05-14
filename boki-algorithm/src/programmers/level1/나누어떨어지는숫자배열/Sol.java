package programmers.level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sol {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> divZeroList = new ArrayList<>();
        for (int x : arr) {
            if (x % divisor == 0) divZeroList.add(x);
        }
        divZeroList.sort(Comparator.naturalOrder());
        int[] answer = new int[divZeroList.size()];
        for (int i = 0; i < divZeroList.size(); i++) {
            answer[i] = divZeroList.get(i);
        }
        return answer.length == 0 ? new int[]{-1} : answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(Arrays.toString(s.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(s.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(s.solution(new int[]{3, 2, 6}, 10)));
    }
}
