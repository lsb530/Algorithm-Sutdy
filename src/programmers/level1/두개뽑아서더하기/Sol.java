package programmers.level1.두개뽑아서더하기;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sol {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        int idx = 0;
        while(it.hasNext()) answer[idx++] = it.next();
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 1, 3, 4, 1})));
        System.out.println(Arrays.toString(s.solution(new int[]{5, 0, 2, 7})));
    }
}
