package boj.steps.a10재귀.별찍기10;

import static java.lang.System.out;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class p2447_re {

    static char[][] arr;
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out));

    public static void main(String[] args) throws IOException {
        // 크기 N의 패턴은 N*N 정사각형 모양
        // N=3
        /*
         ***
         * *
         ***
         */
        // N>3, 크기 N의 패턴은 공백으로 채워진 가운데의 (N/3)*(N/3)정사각형을 N/3패턴으로 둘러싼 형태
        // ex) 9, (9/3)*(9/3) 정사각형을 9/3의 패턴으로 둘러쌈
        // 9, 3*3 정사각형을 3의 패턴으로 둘러쌈
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        arr = new char[N][N];
        star(0, 0, N, false);
        for (int i = 0; i < N; i++) {
            bw.write(arr[i]);
            bw.write('\n');
        }
        bw.flush();
        bw.close();
    }

    // blank 가 true 라면 공백칸임을 의미
    static void star(int x, int y, int N, boolean blank) {
        // 공백칸일 경우
        if (blank) {
            for (int i = x; i < x + N; i++) {
                for (int j = y; j < y + N; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // 더이상 쪼갤 수 없는 블록일 때
        if (N == 1) {
            arr[x][y] = '*';
            return;
        }
        /*
        N=27 일 경우 한 블록의 사이즈는 9이고,
        N=9 일 경우 한 블록의 사이즈는 3이듯
        해당 블록의 한 칸을 담을 변수를 의미 size

        count 는 별 출력 누적 합을 의미하는 변수다.
        */
        int size = N / 3;
        int count = 0;
        for (int i = x; i < x + N; i += size) {
            for (int j = y; j < y + N; j += size) {
                count++;
                // 공백 칸일 경우
                star(i, j, size, count == 5);
            }
        }
    }
}