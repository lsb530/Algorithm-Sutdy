import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Sol06 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4, 4, 4, 4, 4})));
    }

    public static int[] solution(int N, int[] stages) {
        // 스테이지별 도전자수
        int[] challenger = new int[N + 2];
        for (int i = 0; i < stages.length; i++) {
            challenger[stages[i]] += 1;
            // System.out.println(Arrays.toString(challenger));
        }

        // 스테이지별 실패한 사용자 수 계산
        HashMap<Integer, Double> fails = new HashMap<>();
        double total = stages.length;

        // 각 스테이지 순회하며, 실패율 계산
        for (int i = 1; i <= N; i++) {
            if (challenger[i] == 0) {
                fails.put(i, 0.);
            } else {
                fails.put(i, challenger[i] / total);
                total -= challenger[i];
            }
        }

        // 실패율이 높은 스테이지부터 내림차순으로 정렬
        return fails.entrySet().stream().sorted((o1, o2) -> Double.compare(o2.getValue(), o1.getValue()))
                .mapToInt(Map.Entry::getKey).toArray();
    }
}
