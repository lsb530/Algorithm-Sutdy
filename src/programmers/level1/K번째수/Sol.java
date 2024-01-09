package programmers.level1.K번째수;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sol {
    
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> list = new ArrayList<>();
        for (int x : array) { list.add(x); }
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int idx = commands[i][2] - 1;
            List<Integer> subList = new ArrayList<>(list.subList(start - 1, end));
            subList.sort(Comparator.naturalOrder());
            answer[i] = subList.get(idx);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        int[] solution = s.solution(new int[]{1, 5, 2, 6, 3, 7, 4},
            new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
        System.out.println(Arrays.toString(solution));
    }
}
