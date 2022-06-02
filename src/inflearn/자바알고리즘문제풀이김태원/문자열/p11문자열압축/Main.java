package inflearn.자바알고리즘문제풀이김태원.문자열.p11문자열압축;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        str = str + " ";
        StringBuilder answer = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                answer.append(str.charAt(i));
                if(cnt > 1) answer.append(cnt);
                cnt = 1;
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        // KKHSSSSSSSE             K2HS7E
        // KSTTTSEEKFKKKDJJGG      KST3SE2KFK3DJ2G2
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}