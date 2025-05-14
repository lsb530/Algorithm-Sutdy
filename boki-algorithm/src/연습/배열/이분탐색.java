package 연습.배열;

import java.util.Arrays;
import util.ArrayUtil;

public class 이분탐색 {

    public static void main(String[] args) {
        int SIZE = 100;
        int[] array = ArrayUtil.create(100, 100);
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        String answer;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= SIZE; i++) {
            answer = binarySearch(array, i) == -1 ? "[X] " : "[O] ";
            sb.append(i + answer);
            if(i%10==0 && i != 0) sb.append("\n");
//            System.out.println(answer);
        }
        System.out.println(sb);
    }

    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        for (int i = 0; i < arr.length && low <= high; i++) {
            int mid = (low + high) / 2;    // 중간위치를 구한다.
            if (key < arr[mid]) {
                high = mid - 1;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}