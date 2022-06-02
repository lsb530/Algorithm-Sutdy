package inflearn.자바알고리즘문제풀이김태원.문자열.p6중복문자제거;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution(str));
    }
}