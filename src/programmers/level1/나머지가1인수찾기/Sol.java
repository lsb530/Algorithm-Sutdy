package programmers.level1.나머지가1인수찾기;

public class Sol {
    public int solution(int n) {
        int answer = 1_000_000;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) answer = Math.min(answer, i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(10));
        System.out.println(s.solution(12));
    }
}
