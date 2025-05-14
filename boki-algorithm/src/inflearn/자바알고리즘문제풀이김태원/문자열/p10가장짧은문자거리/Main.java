package inflearn.자바알고리즘문제풀이김태원.문자열.p10가장짧은문자거리;

import java.util.Scanner;

public class Main {

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t) p = 0;
            else p++;
            answer[i] = p;
        }
        for (int i = answer.length - 1; i >= 0; i--) {
            if(s.charAt(i) == t) p = 0;
            else p++;
            answer[i] = Math.min(p,answer[i]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x + " ");
        }
    }
}