package programmers.level1.숫자문자열과영단어;

public class Sol {
    public int solution(String s) {
        String[] alphabets = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < 10; i++) {
            s = s.replaceAll(alphabets[i], "" + i);
        }
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution("one4seveneight"));
    }
}
