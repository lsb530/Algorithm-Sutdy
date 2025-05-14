package programmers.코딩기초트레이닝.연산.두수의연산값비교하기;

class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt(String.valueOf(a) + b);
        int y = 2 * a * b;
        return Math.max(x, y);
    }
}