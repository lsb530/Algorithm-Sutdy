package programmers.코딩기초트레이닝.조건문.주사위게임2;

class Solution {
    public int solution(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            return a + b + c;
        }
        else {
            int sum = a + b + c;
            int squareSum = a * a + b * b + c * c;
            int cubeSum = a * a * a + b * b * b + c * c * c;
            return a == b && b == c ? sum * squareSum * cubeSum : sum * squareSum;
        }
    }
}