package programmers.코딩기초트레이닝.조건문.코드처리하기;

class Solution {
    public static String solution(String code) {
        String answer = "";
        boolean mode = false;
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode = !mode;
                continue;
            }
            if (mode) {
                answer += i % 2 != 0 ? c : "";
            } else {
                answer += i % 2 == 0 ? c : "";
            }
        }
        return answer != "" ? answer : "EMPTY";
    }

    public static void main(String[] args) {
        System.out.println(solution("abc1abc1abc"));
    }
}