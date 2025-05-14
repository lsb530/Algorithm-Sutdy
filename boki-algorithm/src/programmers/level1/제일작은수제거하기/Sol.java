package programmers.level1.제일작은수제거하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for (int x : arr) {
            list.add(x);
            min = Math.min(min, x);
        }
        // List.remove: 객체를 전달하면 객체를 지우고, 원시값을 전달하면 인덱스를 지움
        list.remove(Integer.valueOf(min));
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer.length == 0 ? new int[]{-1} : answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(Arrays.toString(s.solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{10})));
    }
}
