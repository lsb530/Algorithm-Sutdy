import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Sol03 {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 4, 1};
        int[] arr2 = {5, 0, 2, 7};

        // System.out.println(Arrays.toString(solution(arr1)));
        // System.out.println(Arrays.toString(solution(arr2)));

        System.out.println(Arrays.toString(solution2(arr1)));
        System.out.println(Arrays.toString(solution2(arr2)));
    }

    /**
     * 서로 다른 인덱스에 있는 2개의 수를 뽑아 더해 만들 수 있는 모든 수를 배열에 오름차순으로 담아 반환(중복제거)
     */
    private static int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                answer.add(arr[i] + arr[j]);
            }
        }
        return answer.stream().distinct().sorted().mapToInt(Integer::intValue).toArray();
    }

    private static int[] solution2(int[] arr) {
        HashSet<Integer> answer = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                answer.add(arr[i] + arr[j]);
            }
        }
        return answer.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}
