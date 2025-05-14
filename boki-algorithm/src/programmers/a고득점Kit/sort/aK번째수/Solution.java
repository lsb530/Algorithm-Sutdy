package programmers.a고득점Kit.sort.aK번째수;

import java.util.Arrays;

public class Solution {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for (int[] command : commands) {
            int start = command[0];
            int end = command[1];
            int target = command[2];
            int[] process = new int[end - start + 1];
            int j = 0;
            for (int i = start - 1; i < end; i++) {
                process[j] = array[i];
                j++;
            }
            Arrays.sort(process);
            answer[idx] = process[target - 1];
            idx++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] sol = solution(array, commands);
        for (int i = 0; i < sol.length; i++) {
            System.out.print(sol[i] + " ");
        }
    }
}