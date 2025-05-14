package programmers.코딩기초트레이닝.연산과조건문.홀짝에따라다른값반환하기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        final boolean isEven = n % 2 == 0;
        int start = isEven ? 2 : 1;
        for (int i = start; i <= n; i += 2) {
            answer += isEven ? i * i : i;
        }
        return answer;
    }
}