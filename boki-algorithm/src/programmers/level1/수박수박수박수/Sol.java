package programmers.level1.수박수박수박수;

import java.util.stream.Stream;

public class Sol {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) sb.append("수");
            else sb.append("박");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        s.solution(3);
        s.solution(4);
    }
}
