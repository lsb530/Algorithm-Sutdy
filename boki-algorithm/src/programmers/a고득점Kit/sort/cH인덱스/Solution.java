package programmers.a고득점Kit.sort.cH인덱스;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for (int i = 0; i < citations.length; i++) {
            int h_index = citations.length - i;
//            System.out.printf("h_index = %d, citations[i] = %d\n", h_index, citations[i]);
            if (citations[i] >= h_index) {
                answer = h_index;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        int solution = solution(citations);
        System.out.println("solution = " + solution);
    }
}