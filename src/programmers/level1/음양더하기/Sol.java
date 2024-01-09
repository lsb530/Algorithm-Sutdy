package programmers.level1.음양더하기;

public class Sol {

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            int mul = signs[i] ? 1 : -1;
            answer += (absolutes[i] * mul);
        }
        return answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
        System.out.println(s.solution(new int[]{1, 2, 3}, new boolean[]{false, false, true}));
    }
}
