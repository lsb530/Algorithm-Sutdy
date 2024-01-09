package programmers.level1.개인정보수집유효기간;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int year = Integer.parseInt(today.split("\\.")[0]);
        int month = Integer.parseInt(today.split("\\.")[1]);
        int day = Integer.parseInt(today.split("\\.")[2]);

        final int ONE_MONTH_DAY = 28;

        System.out.println("year = " + year);
        System.out.println("month = " + month);
        System.out.println("day = " + day);

        int days = (year * 12 * ONE_MONTH_DAY) + (month * 12 * ONE_MONTH_DAY) + day;
        System.out.println("days = " + days);


        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String today = "2022.05.19";
        String[] terms = new String[]{"A 6", "B 12", "C 3"};
        String[] privacies = new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        int[] answer = sol.solution(today, terms, privacies);
        System.out.println(answer);
    }
}
