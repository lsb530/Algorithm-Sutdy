import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Sol31 {

    public static void main(String[] args) {
        int answer1 = solution(new int[]{3, 1, 2, 3});
        System.out.println(answer1); // 2

        int answer2 = solution(new int[]{3, 3, 3, 2, 2, 4});
        System.out.println(answer2); // 3

        int answer3 = solution(new int[]{3, 3, 3, 2, 2, 2});
        System.out.println(answer3); // 2
    }

    public static int solution(int[] nums) {
        // nums 리스트에서 중복을 제거한 집합(set)을 구함
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));
        // 폰켓몬의 총 수
        int n = nums.length;
        // 선택할 폰켓몬의 수
        int k = n / 2;
        // 중복을 제거한 폰켓몬의 종류 수와 선택할 폰켓몬의 수 중 작은 값 반환
        return Math.min(set.size(), k);

        // return Math.min((int) Arrays.stream(nums).distinct().count(), nums.length / 2);
    }
}
