package 연습;

import java.util.Arrays;

public class 마이너스정렬 {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,-3,-5,-3,-7,0,1,3,2,3,2,4,6,3,10,10,9,-2,0};
        int target = 10;
        int count = solution(arr, target);
        System.out.println("target = " + target + ", count = " + count);
    }

    public static int solution(int[] arr, int target) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int upperIndex = 0;
        int high = arr.length;
        while(upperIndex < high) {
            int mid = (upperIndex + high) / 2;
            if (target < arr[mid]) high = mid;
            else upperIndex = mid + 1; // 같으면 하한을 높임
        }
        int lowerIndex = 0;
        high = arr.length;
        while(lowerIndex < high) {
            int mid = (lowerIndex + high) / 2;
            if (target <= arr[mid]) high = mid; // 같으면 상한을 좁힘
            else lowerIndex = mid + 1;
        }
        return upperIndex - lowerIndex;
    }
}