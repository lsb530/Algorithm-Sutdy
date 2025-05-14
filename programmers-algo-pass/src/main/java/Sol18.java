import java.util.HashSet;

public class Sol18 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 8}, 6));
        System.out.println(solution(new int[]{2, 3, 5, 9}, 10));
    }

    public static boolean solution(int[] arr, int target) {
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i : arr) {
            // target에서 현재 원소를 뺀 값이 hashSet에 있는지 확인
            if (hashSet.contains(target - i)) {
                return true;
            }

            // hashSet에 현재 값 저장
            hashSet.add(i);
        }

        return false;
    }

}
