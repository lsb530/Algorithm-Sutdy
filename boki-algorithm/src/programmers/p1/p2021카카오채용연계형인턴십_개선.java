package programmers.p1;

import java.util.*;

public class p2021카카오채용연계형인턴십_개선 {

    static final String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven",
        "eight", "nine"};

    public static int solution(String s) {
        HashMap<String, Integer> m = new HashMap<>();
        for (int i = 0; i < eng.length; i++) {
            m.put(eng[i], i);
        }
//        m.put("zero", 0);
//        m.put("one", 1);
//        m.put("two", 2);
//        m.put("three", 3);
//        m.put("four", 4);
//        m.put("five", 5);
//        m.put("six", 6);
//        m.put("seven", 7);
//        m.put("eight", 8);
//        m.put("nine", 9);
        int answer = 0;
        int len = s.length();
        String str = "";
        // "one4seveneight"
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if ('0' <= c && c <= '9') {
                answer = answer * 10 + c - '0';
            } else {
                str += c;
                if (m.containsKey(str)) { // 문자열을 더해서 찾았을때
                    answer = answer * 10 + m.get(str);
                    str = "";
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        // 1 4 7 8
        System.out.println(solution("one4seveneight"));
    }
}