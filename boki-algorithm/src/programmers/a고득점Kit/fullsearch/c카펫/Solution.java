package programmers.a고득점Kit.fullsearch.c카펫;

public class Solution {

    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        if(yellow == 1) {
            answer[0] = yellow + 2;
            answer[1] = 3;
            return answer;
        }
        for (int i = 2; i <= yellow; i++) {
            float a = (float)yellow / i;
            if(a - (int)a != 0.0 || a == 0) continue;
            int b = yellow / (int)a;
            if (a < b) {
                continue;
            }
            int val = (int)(a + 2) * 2 + (b * 2);
            if (val == brown) {
                answer[0] = (int)a + 2;
                answer[1] = b + 2;
                return answer;
            }
        }
        answer[0] = yellow + 2;
        answer[1] = 3;
        return answer;
    }

    public static void main(String[] args) {
        int brown1 = 10, yellow1 = 2;
        int[] sol1 = solution(brown1, yellow1);
        for (int i = 0; i < sol1.length; i++) {
            System.out.print(sol1[i] + " ");
        }
        System.out.println();
        int brown2 = 8, yellow2 = 1;
        int[] sol2 = solution(brown2, yellow2);
        for (int i = 0; i < sol2.length; i++) {
            System.out.print(sol2[i] + " ");
        }
        System.out.println();
        int brown3 = 24, yellow3 = 24;
        int[] sol3 = solution(brown3, yellow3);
        for (int i = 0; i < sol3.length; i++) {
            System.out.print(sol3[i] + " ");
        }
        System.out.println();
        int brown4 = 16, yellow4 = 5;
        int[] sol4 = solution(brown4, yellow4);
        for (int i = 0; i < sol4.length; i++) {
            System.out.print(sol4[i] + " ");
        }
        System.out.println();
    }
}