package programmers.level2.문자열압축;

public class Solution {

    public static int solution(String s) {
        if(s.length() == 1) return 1;
        int answer;
        String text;
        int min = Integer.MAX_VALUE;
        for (int j = 1; j < s.length(); j++) {
            StringBuilder sb = new StringBuilder();
            text = "";
            String before = "";
            int cnt = 1;
            int last = 0;
            for (int i = 0; i < s.length() && i + j <= s.length(); i += j) {
                String after = s.substring(i, i + j);
                last = i + j;
                if (!before.equals(after)) {
                    if (cnt == 1) {
                        text += before;
                    } else {
                        text += (cnt + before);
                    }
                    before = after;
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            if (cnt == 1) {
                text += before;
            } else {
                text += (cnt + before);
            }
            text += s.substring(last);
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
        solution(s1);
        solution(s2);
        solution(s3);
        solution(s4);
        solution(s5);
    }
}