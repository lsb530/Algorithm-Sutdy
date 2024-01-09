package programmers.level1.가운데글자가져오기;

public class Sol {
    public String solution(String s) {
        int mid = s.length() / 2;
        return s.length() % 2 == 0 ? s.substring(mid - 1, mid + 1) : s.substring(mid, mid + 1);
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution("abcde"));
        System.out.println(s.solution("qwer"));
    }
}
