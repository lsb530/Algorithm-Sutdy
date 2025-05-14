package programmers.level1.문자열다루기기본;

public class Sol {
    public boolean solution(String s) {
        String regex = "^\\d{4}|\\d{6}$";
        boolean matches = s.matches(regex);
        return matches;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
//        System.out.println(s.solution("a234"));
        System.out.println(s.solution("1234"));
        System.out.println(s.solution("123456"));
        System.out.println(s.solution("123456a"));
    }
}
