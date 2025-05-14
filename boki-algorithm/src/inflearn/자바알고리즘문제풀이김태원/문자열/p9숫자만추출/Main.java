package inflearn.자바알고리즘문제풀이김태원.문자열.p9숫자만추출;

import java.util.Scanner;

public class Main {

    public int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}