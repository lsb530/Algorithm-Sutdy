package programmers.level1.내적;

public class Solution {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{-3, -1, 0, 2};
        solution(a, b);
    }

    public static int solution(int[] a, int[] b) {
        int answer = 0;
        for (int i = 0; i < a.length; i++) {
            answer += (a[i] * b[i]);
        }
        System.out.println("answer = " + answer);
        return answer;
    }
}