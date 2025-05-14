package 연습.부분합;

import util.ArrayUtil;

public class 구간합빠르게계산하기 {

    // 시간복잡도: O(N+M)
    // Prefix Sum
    public static void main(String[] args) {
        // 데이터 개수 N과 데이터 입력받기
        int N = 5;
        int[] data = {10, 20, 30, 40, 50};

        // Prefix Sum 배열 계산
        int summary = 0;
        int[] prefix_sum = new int[5];
        for (int i = 0; i < N; i++) {
            summary += data[i];
            prefix_sum[i] = summary;
        }

        // 구간합 계산
        int left = 3;
        int right = 4;
        ArrayUtil.print(data);
        ArrayUtil.print(prefix_sum);
        System.out.println(prefix_sum[right] - prefix_sum[left - 1]);
    }
}