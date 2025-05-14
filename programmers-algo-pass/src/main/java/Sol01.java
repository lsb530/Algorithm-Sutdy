import java.util.Arrays;

public class Sol01 {
    public static void main(String[] args) {
        int[] arr1 = {1, -5, 2, 4, 3};
        int[] arr2 = {2, 1, 1, 3, 2, 5, 4};
        int[] arr3 = {6, 1, 7};

        System.out.println(Arrays.toString(solution(arr1)));
        System.out.println(Arrays.toString(solution(arr2)));
        System.out.println(Arrays.toString(solution(arr3)));
    }

    /**
     *  오름차순 정렬
     */
    public static int[] solution(int[] arr) {
        int[] clonedArr = arr.clone();
        Arrays.sort(clonedArr);
        return clonedArr;
    }
}
