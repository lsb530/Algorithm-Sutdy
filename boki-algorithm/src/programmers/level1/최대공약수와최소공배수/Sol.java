package programmers.level1.최대공약수와최소공배수;

import java.util.Arrays;

public class Sol {

    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 최대공약수(GCD)
        answer[0] = (int)Greatest_Common_Divisor(n, m);
        // 최소공배수(GCM)
        answer[1] = (int)Greatest_Common_Multiple(n, m, answer[0]);

        // OR
        for (int i = 1; i < n + m; i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(Arrays.toString(s.solution(3, 12)));
        System.out.println(Arrays.toString(s.solution(2, 5)));
    }
    public static long Greatest_Common_Divisor(long a, long b) {
        if (b == 0) return a;
        else return Greatest_Common_Divisor(b, a % b);
    }

    public static long Greatest_Common_Multiple(long a, long b, long gcd) {
        return a * b / gcd;
    }
}
