package boj.steps.a20분할정복.종이의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] papers;
    static int NEGATIVE, ZERO, POSITIVE;

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        papers = new int[N][N];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                papers[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        cutPapers(0, 0, N);
        System.out.println(NEGATIVE);
        System.out.println(ZERO);
        System.out.println(POSITIVE);
    }

    static void cutPapers(int x, int y, int size) {
        if (isPossible(x, y, size)) {
            if (papers[x][y] == -1) {
                NEGATIVE++;
            } else if (papers[x][y] == 0) {
                ZERO++;
            } else {
                POSITIVE++;
            }
            return;
        }
        int newSize = size / 3;

        cutPapers(x, y, newSize); // 왼쪽 위
        cutPapers(x, y + newSize, newSize); // 중앙 위
        cutPapers(x, y + newSize * 2, newSize); // 오른쪽 위

        cutPapers(x + newSize, y, newSize); // 왼쪽 중간
        cutPapers(x + newSize, y + newSize, newSize); // 중앙 중간
        cutPapers(x + newSize, y + newSize * 2, newSize); // 오른쪽 중간

        cutPapers(x + newSize * 2, y, newSize); // 왼쪽 아래
        cutPapers(x + newSize * 2, y + newSize, newSize); // 중앙 아래
        cutPapers(x + newSize * 2, y + newSize * 2, newSize); // 오른쪽 아래
    }

    static boolean isPossible(int x, int y, int size) {
        int p = papers[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (p != papers[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}