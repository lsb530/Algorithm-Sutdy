package programmers.level1.하샤드수;

public class Sol {
    public boolean solution(int x) {
        char[] chars = ("" + x).toCharArray();
        int a = 0;
        for (char c : chars) a += (c - '0');
        return x % a == 0;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(10));
        System.out.println(s.solution(12));
        System.out.println(s.solution(11));
        System.out.println(s.solution(13));
    }
}
