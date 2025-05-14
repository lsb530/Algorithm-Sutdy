package 연습.배열;

import java.util.Arrays;
import java.util.Collections;
import util.ArrayUtil;

public class 상한하한이분탐색 {

    public static void main(String[] args) {
        int[] arr = ArrayUtil.createNegative(100, 100);
        Arrays.sort(arr);
//        ArrayUtil.print(Collections.singleton(arr));
        ArrayUtil.print(arr);
        int k = 1;
        for (int i = 0; i < 100; i++, k++) {
            int cnt = upperBound(arr, arr[i]) - lowerBound(arr, arr[i]);
            System.out.printf("[%3d]: %d ", arr[i], cnt);
            i += cnt - 1;
            if (k % 10 == 0) {
                System.out.println();
            }
        }
    }

    // 하한: 목적값을 처음으로 만나는 index
    private static int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) { // 같아질 때까지 반복
            int mid = (low + high) / 2;
            if (target <= arr[mid]) {
                high = mid; // 같으면 상한을 좁힘
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    // 상한: 목적값을 처음으로 초과하는 index
    private static int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length;
        while (low < high) {
            int mid = (low + high) / 2;
            if (target < arr[mid]) {
                high = mid;
            } else {
                low = mid + 1; // 같으면 하한을 높임
            }
        }
        return low;
    }
}