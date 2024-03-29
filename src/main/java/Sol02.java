import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Sol02 {
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 1, 3, 4};
        int[] arr2 = {4, 3, 2, 1};

        // System.out.println(Arrays.toString(solution(arr1)));
        // System.out.println(Arrays.toString(solution(arr2)));

        System.out.println(Arrays.toString(solution2(arr1)));
        System.out.println(Arrays.toString(solution2(arr2)));
    }

    /**
     * 중복 제거, 내림차순 정렬
     */
    private static int[] solution(int[] arr) {
        Integer[] result = Arrays.stream(arr).boxed().distinct().toArray(Integer[]::new);
        // Arrays.sort(result, (o1, o2) -> o2.compareTo(o1));
        Arrays.sort(result, Comparator.reverseOrder());
        return Arrays.stream(result).mapToInt(Integer::intValue).toArray();
    }

    private static int[] solution2(int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for (int num : arr) {
            set.add(num);
        }

        int[] result = new int[set.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = set.pollFirst();
        }

        return result;
    }
}
