package 연습.부분합;

public class 투포인터 {
    // 특정한 합을 가지는 부분 연속수열 찾기
    public static void main(String[] args) {
        // 데이터의 개수 N과 부분연속 수열의 합 M을 입력받기
        int N = 5, M = 5;
        int[] data = {1, 2, 3, 2, 5};

        int count = 0;
        int summary = 0;
        int end = 0;

        // start를 차롇대로 증가시키며 반복
        for (int start = 0; start < N; start++) {
            // end를 가능한 만큼 이동시키기
            while (summary < M && end < N) {
                summary += data[end];
                end++;
            }
            // 부분합이 M일때 카운트 증가
            if (summary == M) {
                count++;
            }
            summary -= data[start];
        }

        System.out.println(count);
    }
}