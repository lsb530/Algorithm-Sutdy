package programmers.level1.숫자문자열과영단어;

public class Solution {

    public static void main(String[] args) {
        String s1 = "one4seveneight";
        solution(s1);
        String s2 = "23four5six7";
        solution(s2);
        String s3 = "2three45sixseven";
        solution(s3);
        String s4 = "123";
        solution(s4);
    }

    public static int solution(String s) {
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alphabets[i], "" + i);
        }
        return Integer.parseInt(s);
    }
}