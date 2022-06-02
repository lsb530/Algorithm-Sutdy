package inflearn.자바알고리즘문제풀이김태원.문자열.p4단어뒤집기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<String> solution(int n, String[] str) {
        List<String> answer = new ArrayList<>();
        for (String x : str) {
            String temp = new StringBuilder(x).reverse().toString();
            answer.add(temp);
        }
        return answer;
    }

//    public List<String> solution(int n, String[] str) {
//        List<String> answer = new ArrayList<>();
//        for (String x : str) {
//            char[] s = x.toCharArray();
//            int lt = 0, rt = x.length() - 1;
//            while(lt < rt) {
//                char temp = s[lt];
//                s[lt] = s[rt];
//                s[rt] = temp;
//                lt++;
//                rt--;
//            }
//            String temp = String.valueOf(s);
//            answer.add(temp);
//        }
//        return answer;
//    }

    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }
        for (String x : t.solution(n, str)) {
            System.out.println(x);
        }
    }
}