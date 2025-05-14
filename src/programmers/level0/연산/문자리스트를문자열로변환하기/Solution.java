package programmers.코딩기초트레이닝.연산.문자리스트를문자열로변환하기;

class Solution {
    public static String solution(String[] arr) {
        return String.join("", arr);
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}));
    }
}

