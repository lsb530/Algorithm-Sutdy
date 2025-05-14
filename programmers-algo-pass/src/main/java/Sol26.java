
public class Sol26 {

    public static void main(String[] args) {
        int answer = solution(8, 4, 7);
        System.out.println(answer); // 3
    }

    public static int solution(int n, int a, int b) {
        int answer;

        for (answer = 0; a != b; answer++) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
        }

        return answer;
    }
}
