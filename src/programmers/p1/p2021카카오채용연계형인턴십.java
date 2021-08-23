package programmers.p1;

import java.io.*;
import java.util.*;

public class p2021카카오채용연계형인턴십 {

    public static void main(String[] args) throws IOException {
        // s = "one4seveneight"
        HashMap<String, Integer> m = new HashMap<String, Integer>();
        m.put("zero", 0);
        m.put("one", 1);
        m.put("two", 2);
        m.put("three", 3);
        m.put("four", 4);
        m.put("five", 5);
        m.put("six", 6);
        m.put("seven", 7);
        m.put("eight", 8);
        m.put("nine", 9);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int len = s.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            boolean flag = false;
            for (String k : m.keySet()) {
                if (i + k.length() <= len) {
                    String substr = s.substring(i, i + k.length());
                    if (substr.equals(k)) {
                        sb.append(m.get(substr));
                        i += k.length() - 1;
                        flag = true;
                        break;
                    }
                }
            }
            if (!flag) { // 못 찾은 경우
                sb.append(s.charAt(i));
            }
        }
        int i = Integer.parseInt(String.valueOf(sb));
        System.out.println(sb);
    }
}