package boj.steps.a21이분탐색.숫자카드2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[] cards, findCards;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }
        int M = Integer.parseInt(br.readLine());
        findCards = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            findCards[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cards);
//        System.out.println(lowerBound(0,N,10));
//        System.out.println(upperBound(0,N,10));
        for (int i = 0; i < M; i++) {
            sb.append(upperBound(0,N,findCards[i]) - lowerBound(0, N, findCards[i])).append(' ');
        }
        System.out.println(sb);
    }
    
    // 하한: 목적값을 처음으로 만나는 index
    private static int lowerBound(int low, int high, int target) {
        while(low < high) { // 같아질 때까지 반복
            int mid = (low + high) / 2;
            if (target <= cards[mid]) high = mid; // 같으면 상한을 좁힘
            else low = mid + 1;
        }
        return low;
    }

    // 상한: 목적값을 처음으로 초과하는 index
    private static int upperBound(int low, int high, int target) {
        while(low < high) {
            int mid = (low + high) / 2;
            if (target < cards[mid]) high = mid;
            else low = mid + 1; // 같으면 하한을 높임
        }
        return low;
    }

}