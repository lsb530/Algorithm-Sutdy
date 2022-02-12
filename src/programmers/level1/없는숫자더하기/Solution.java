package programmers.level1.없는숫자더하기;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4, 6, 7, 8, 0};
        solution(numbers1);
        int[] numbers2 = new int[]{5, 8, 4, 0, 6, 7, 9};
        solution(numbers2);
    }

    public static int solution(int[] numbers) {
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numSet.add(i);
        }
        for(int n : numbers) {
            numSet.remove(n);
        }
        int answer = 0;
        for (Integer x : numSet) {
            answer += x;
        }
        return answer;
    }
}