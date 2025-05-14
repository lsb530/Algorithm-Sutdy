package programmers.level1.두정수사이의합;

public class Sol {
    public long solution(int a, int b) {
        if (a == b) return a;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return (long) (max - min + 1) * (min + max) / 2;
//        long answer = 0;
//        for (long i = min; i <= max; i++) {
//            answer += i;
//        }
//        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(3, 5));
        System.out.println(s.solution(3, 3));
        System.out.println(s.solution(5, 3));
    }
}
