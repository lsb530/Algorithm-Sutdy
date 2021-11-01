package boj.steps.a20분할정복.쿼드트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static char[][] pic;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        pic = new char[N][N];
        int sz = N;
        int i = 0;
        while(N-- > 0) {
            pic[i] = br.readLine().toCharArray();
            i++;
        }
        QuadTree(0, 0, sz);
        System.out.println(sb);
    }

    static void QuadTree(int x, int y, int size) {
        if (isPossible(x, y, size)) {
            sb.append(pic[x][y]);
            return;
        }

        int newSize = size / 2;
        sb.append("(");
        QuadTree(x, y, newSize);
        QuadTree(x, y + newSize, newSize);
        QuadTree(x + newSize, y, newSize);
        QuadTree(x + newSize, y + newSize, newSize);
        sb.append(")");
    }

    static boolean isPossible(int x, int y, int size) {
        char v = pic[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if(v != pic[i][j]) return false;
            }
        }
        return true;
    }
}