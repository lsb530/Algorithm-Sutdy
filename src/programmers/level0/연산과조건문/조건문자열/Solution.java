package programmers.코딩기초트레이닝.연산과조건문.조건문자열;

class Solution {
    public static int solution(String ineq, String eq, int n, int m) {
        String evaluation = ineq + eq;
        return switch (evaluation) {
            case "<=" -> n <= m ? 1 : 0;
            case "<!" -> n < m ? 1 : 0;
            case ">=" -> n >= m ? 1 : 0;
            case ">!" -> n > m ? 1 : 0;
            default -> throw new IllegalStateException("Unexpected value: " + evaluation);
        };
    }

    public static void main(String[] args) {
        System.out.println(solution("<", "=", 20, 50));
        System.out.println(solution(">", "!", 41, 78));
    }
}