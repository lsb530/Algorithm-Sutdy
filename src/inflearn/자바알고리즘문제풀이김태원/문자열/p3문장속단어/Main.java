package inflearn.자바알고리즘문제풀이김태원.문자열.p3문장속단어;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while((pos = str.indexOf(' ')) != -1) {
            String temp = str.substring(0, pos);
            int len = temp.length();
            if(len > max) {
                max = len;
                answer = temp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > max) answer = str;
        return answer;
    }

//    public String solution(String str) {
//        String answer = "";
//        int max = Integer.MIN_VALUE;
//        String[] s = str.split(" ");
//        for (String x : s) {
//            int len = x.length();
//            if(len > max) {
//                max = len;
//                answer = x;
//            }
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution(str));
    }
}