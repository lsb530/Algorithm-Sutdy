package programmers.level1.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int[] solution(int[] arr, int divisor, Integer test) {

        if(test != null) {
            test /= 2;
            System.out.println(test);
        }

        ArrayList<Integer> answer = new ArrayList<>();
        for(int x: arr) {
            if(x % divisor == 0) answer.add(x);
        }
        if(answer.size() == 0) answer.add(-1);
        Collections.sort(answer);
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}