package programmers.level1.약수의개수와덧셈;

public class Solution {

    public static void main(String[] args) {
        int sol1 = solution(13, 17);
        System.out.println("sol1 = " + sol1);
        int sol2 = solution(24, 27);
        System.out.println("sol2 = " + sol2);
    }

    public static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if(getDivisorCount(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }

    public static int getDivisorCount(int N) {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}