package programmers.level1.삼진법뒤집기;

public class Sol {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        // 몫이 0일때까지 나눈 나머지를 sb에 넣음
        while (n != 0) {
            sb.append(n % 3);
            n /= 3;
        }
        String s = new StringBuilder(sb.toString().replaceFirst("0*", "")).reverse().toString();
        int answer = 0;
        int mul = 0;
        for (char c : s.toCharArray()) {
            answer += (c - '0') * (Math.pow(3, mul++));
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(45));
        System.out.println(s.solution(125));
    }
}
