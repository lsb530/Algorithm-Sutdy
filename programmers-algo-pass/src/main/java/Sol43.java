import java.util.ArrayList;

public class Sol43 {

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(2));
        System.out.println(solution(7));
    }

    // 조합 결과를 담을 리스트
    private static ArrayList<ArrayList<Integer>> result;
    private static int n;

    private static void backtrack(int sum, ArrayList<Integer> selectedNums, int start) {
        if (sum == 10) {
            result.add(selectedNums);
            return;
        }

        for (int i = start; i <= n; i++) {
            if (sum + i <= 10) {
                ArrayList<Integer> list = new ArrayList<>(selectedNums);
                list.add(i);
                backtrack(sum + i, list, i + 1);
            }
        }
    }

    private static ArrayList<ArrayList<Integer>> solution(int N) {
        result = new ArrayList<>();
        n = N;

        // 백트래킹 메소드 호출
        backtrack(0, new ArrayList<>(), 1);

        return result;
    }
}
