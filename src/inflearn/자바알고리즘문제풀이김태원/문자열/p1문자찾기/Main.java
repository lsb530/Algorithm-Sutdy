package inflearn.자바알고리즘문제풀이김태원.문자열.p1문자찾기;

import java.util.Scanner;

public class Main {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for (char c : str.toCharArray()) {
            if(c == t) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(t.solution(str,c));
    }
}