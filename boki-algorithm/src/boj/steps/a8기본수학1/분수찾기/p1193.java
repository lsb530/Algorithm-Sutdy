package boj.steps.a8기본수학1.분수찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1193 {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int seq = Integer.parseInt(br.readLine());
        int crossCount = 1, prevCountSum = 0;
        while (true) {
            // 직전 대각선 누적합 + 해당 대각선 개수 이용한 범위 판별
//            System.out.printf("crossCount = %d, prevCountSum = %d\n", crossCount, prevCountSum);
            if (seq <= prevCountSum + crossCount) {
                int numerator; // 분자
                int denominator; // 분모
                if (crossCount % 2 == 1) { // 대각선의 개수가 홀수라면
                    // 분모가 큰 수부터 시작
                    // 분모: 대각선개수 - (seq - 직전 대각선까지의 누적합 - 1)
                    // 분자: seq - 직전 대각선까지의 누적합
                    numerator = crossCount - (seq - prevCountSum - 1); // 분자
                    denominator = seq - prevCountSum; // 분모
                } else { // 대각선의 개수가 짝수라면
                    // 홀수일때의 출력을 반대로
                    numerator = seq - prevCountSum; // 분모
                    denominator = crossCount - (seq - prevCountSum - 1); // 분자
                }
                System.out.println(numerator + "/" + denominator);
                break;
            } else {
                prevCountSum += crossCount;
                crossCount++;
            }
        }
    }

}