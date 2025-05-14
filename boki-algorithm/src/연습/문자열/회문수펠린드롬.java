package 연습.문자열;

public class 회문수펠린드롬 {

    public static void main(String[] args) {
        // https://www.acmicpc.net/problem/1254
        String str1 = "abab";
        String str2 = "abacaba"; // abacaba
        String str3 = "qwerty";
        String str4 = "abdfhdyrbdbsdfghjkllkjhgfds";
        String[] inpus = new String[] {str1, str2, str3, str4};
        for (int i = 0; i < inpus.length; i++) {
            int solution = Solution(inpus[i]);
            System.out.println(solution);
        }
    }

    public static int Solution(String input) {
        // 입력받은 문자열이 이미 팰린드롬일때
        if (input.equals(new StringBuilder(input).reverse().toString())) {
            return input.length();
        }
        for (int i = 1; i < input.length(); i++) {
            StringBuilder sb = new StringBuilder(input);
            // 앞에서부터 길이 1씩 늘려가면서 뒤에 붙여보자
            sb.append(new StringBuilder(input.substring(0, i)).reverse());
            System.out.println(sb.toString());
            // 팰린드롬인지 체크
            if (sb.toString().equals(sb.reverse().toString())) {
                return sb.length();
            }
        }
        return -1;
    }
}