package boj.silver.silverV;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p1158 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        // input: 7 3 (7명, 3번째 사람 수를 제거)
        // output: <3, 6, 2, 7, 5, 1, 4>
        // process
        // 1 2 3 4 5 6 7
        // 3 제거 1 2 x 4 5 6 7 => 1 2 4(s) 5 6 7
        // 6 제거 1 2 4 5 x 7 => 1 2 4 5 7(s)
        // 2 제거 1 x 4 5 7 => 1 4(s) 5 7
        // 7 제거 1 4 5 x => 1(s) 4 5
        // 5 제거 1 4 x => 1(s) 4
        // 1 제거 x 4 => 4
        // 4 제거
        Queue<Integer> q = new LinkedList<>();
        String[] input = br.readLine().split(" ");
        int size = Integer.parseInt(input[0]);
        int del = Integer.parseInt(input[1]);
        int[] result = new int[size];
        for (int i = 1; i <= size; i++) {
            q.add(i);
        }
        int idx = 0;
        while (!q.isEmpty()) {
            for (int i = 0; i < del; i++) { // 0, 1, 2 세번 실행
                if (i == del - 1) { // 마지막 일때는 헤더를 삭제해주면서 결과배열에 추가
                    result[idx] = q.poll(); // 헤더삭제
                    idx++;
                } else { // 마지막이 아닐 때는 헤더 삭제하면서 끝에 추가
                    q.add(q.poll());
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        builder.append("<");
        for (int i = 0; i < result.length - 1; i++) {
            builder.append(result[i]).append(", ");
        }
        builder.append(result[result.length - 1]).append(">");
        System.out.println(builder);
    }

}