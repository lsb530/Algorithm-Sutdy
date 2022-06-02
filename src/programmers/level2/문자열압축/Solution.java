package programmers.level2.문자열압축;

import java.util.ArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Solution {

    @Test
    void test() {
        String s1 = "aabbaccc";
        String s2 = "ababcdcdababcdcd";
        String s3 = "abcabcdede";
        String s4 = "abcabcabcabcdededededede";
        String s5 = "xababcdcdababcdcd";
        String s6 = "bbaabaaaab";
        String s7 = "zzzbbabbabba";
        Assertions.assertEquals(solution(s1), 7);
        Assertions.assertEquals(solution(s2), 9);
        Assertions.assertEquals(solution(s3), 8);
        Assertions.assertEquals(solution(s4), 14);
        Assertions.assertEquals(solution(s5), 17);
        Assertions.assertEquals(solution(s6), 8);
        Assertions.assertEquals(solution(s7), 7);
    }

    public int solution(String s) {
        if(s.length() == 1) return 1;
        int min = s.length();
        for (int skip = 1; skip < s.length(); skip++) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i+=skip) {
                int lastIdx = Math.min((i + skip), s.length());
                String sub = s.substring(i, lastIdx);
                list.add(sub);
            }
            System.out.println(String.join(",", list));
            int cnt = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < list.size(); i++) {
                String cur = list.get(i);
                String before = list.get(i-1);
                if(cur.equals(before)) {
                    cnt++;
                } else {
//                    System.out.println(before + ", " + cnt);
                    sb.append(cnt).append(before);
                    cnt = 1;
                }
                if(i == list.size() - 1) {
//                    System.out.println(cur + ", " + cnt);
                    sb.append(cnt).append(cur);
                }
            }
            String answer = sb.toString().replace("1", "");
            min = Math.min(min, answer.length());
        }
        return min;
    }

    public static int solution1(String s) {
        if(s.length() == 1) return 1;
        int answer;
        String text;
        int min = Integer.MAX_VALUE;
        for (int j = 1; j < s.length(); j++) { // 1부터 길이까지 반복
            StringBuilder sb = new StringBuilder();
            text = "";
            String before = "";
            int cnt = 1;
            int last = 0;
            // 같이 증가되게 함
            sb.append("split = [");
            for (int i = 0; i < s.length() && i + j <= s.length(); i += j) {
                String split = s.substring(i, i + j);
                sb.append(split + " / ");
                last = i + j;
                if (!before.equals(split)) {
                    if (cnt == 1) {
                        text += before;
                    } else {
                        text += (cnt + before);
                    }
                    before = split;
                    cnt = 1;
                } else {
                    cnt++;
                }
//                System.out.println("split = " + split);
            }
            sb.setLength(sb.length() - 3);
            sb.append("]");
            sb.append(", remain : ");
            sb.append(s.substring(last));
            System.out.println(sb);
            if (cnt == 1) {
                text += before;
            } else {
                text += (cnt + before);
            }
            text += s.substring(last);
            System.out.println("compressed text = " + text);
            min = Math.min(min, text.length());
        }
        answer = min;
        return answer;
    }

    public static void main(String[] args) {
        String s1 = "aabbaccc";
        String s2 = "ababcdcdababcdcd";
        String s3 = "abcabcdede";
        String s4 = "abcabcabcabcdededededede";
        String s5 = "xababcdcdababcdcd";
        solution1(s1);
        solution1(s2);
        solution1(s3);
        solution1(s4);
        solution1(s5);
    }
}