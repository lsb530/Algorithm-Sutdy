package 연습.기본수학;

public class 타겟을증가하는최초의N번째찾기 {
    // Count the minimal number of jumps that the small frog must perform to reach its target.
    public static void main(String[] args) {
        int X = 10;
        int D = 30;
        int Y = 85;
        int solution = solution(X, Y, D);
        System.out.println(solution);
    }

    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((Y - X) / (double) D);
    }
}