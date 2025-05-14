package inflearn.kimtaewon1.c_twopointerandslidingwindow.f_maxlensubseq;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    private static int solution(int n, int k, int[] arr) {
        int answer = 0, cnt = 0, lt = 0;
        for (int rt = 0; rt < n; rt++) {
            if(arr[rt]==0) cnt++;
            while(cnt > k) {
                if (arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(n, k, arr));
    }
}
