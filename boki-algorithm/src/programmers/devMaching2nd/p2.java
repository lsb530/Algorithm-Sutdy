package programmers.devMaching2nd;

public class p2 {
    static class Solution {
        public int solution(int leave, String day, int[] holidays) {
            int[] weekend = {2, 3, 9, 10, 16, 17, 23, 24, 30};
            
            int answer = -1;
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int leave1 = 4;
        String day1 = "FRI";
        int[] holidays1 = {6, 21, 23, 27, 28};
        s.solution(leave1, day1, holidays1);

        int leave2 = 3;
        String day2 = "SUN";
        int[] holidays2 = {6, 21, 23, 27, 28};
        s.solution(leave2, day2, holidays2);

        int leave3 = 30;
        String day3 = "MON";
        int[] holidays3 = {6, 21, 23, 27, 28};
        s.solution(leave3, day3, holidays3);
    }
}