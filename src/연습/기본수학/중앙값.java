package 연습.기본수학;

import java.util.Arrays;

public class 중앙값 {

    public static void main(String[] args) {
        int arr[] = {80, 100, 1, 17, 50, 37, 76, 37, 25, 47, 57, 22, 90};
        Arrays.sort(arr);
        System.out.println(median(arr));
    }

    public static int median(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        return (arr.length % 2 == 0) ?
            (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2 : arr[arr.length / 2];
    }
}