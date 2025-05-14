package codility.lessons.arrays;

import java.util.Arrays;
import java.util.Collections;

public class CyclicRotation {

    public static void main(String[] args) {
        // 모듈러 연산을 이용: a mod n(a % n)을 했을때 이 값은 항상 0~N 까지의 값을 가진다
        // 더해도 마찬가지
        int[] arr = {3, 8, 9, 7, 6};
        int k = 3;
        solution(arr, k);
    }

    public static int[] solution(int[] A, int K) {
        int[] answer = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            answer[(i + K) % A.length] = A[i];
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}