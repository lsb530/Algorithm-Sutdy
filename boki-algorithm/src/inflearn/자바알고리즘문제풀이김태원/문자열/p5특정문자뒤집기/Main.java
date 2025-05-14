package inflearn.자바알고리즘문제풀이김태원.문자열.p5특정문자뒤집기;

import java.util.Scanner;

public class Main {

    public String solution(String str) {
        String answer = "";
        char[] s = str.toCharArray();
        int lt = 0, rt = s.length - 1;
        while(lt < rt) {
            if (!Character.isAlphabetic(s[lt])) { // 왼쪽이 특수문자일 때
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) { // 오른쪽이 특수문자일 때
                rt--;
            } else { // 둘다 알파벳일 때
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(t.solution(str));
    }
}