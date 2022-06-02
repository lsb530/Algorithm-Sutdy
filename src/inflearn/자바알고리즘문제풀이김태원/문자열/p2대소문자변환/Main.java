package inflearn.자바알고리즘문제풀이김태원.문자열.p2대소문자변환;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if(c >= 97 && c <= 122) answer += (char)(c - 32); // 소문자를 대문자로
            else answer += (char)(c + 32); // 대문자를 소문자로
        }
        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(t.solution(str));
    }
}