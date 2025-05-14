package programmers.코딩기초트레이닝.연산과조건문.flag에따라다른값반환하기;

class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}