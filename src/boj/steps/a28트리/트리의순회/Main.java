package boj.steps.a28트리.트리의순회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int[] in, post, pre;
    static int idx;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        in = new int[N];
        post = new int[N];
        pre = new int[N];
        String[] s = br.readLine().split(" ");
        for (int i = 0; i < N; i++)
            in[i] = Integer.parseInt(s[i]);

        s = br.readLine().split(" ");
        for (int i = 0; i < N; i++)
            post[i] = Integer.parseInt(s[i]);

        getPreOrder(0, N - 1, 0, N - 1);
        StringBuilder sb = new StringBuilder();
        for (int i : pre) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    public static void getPreOrder(int inStart, int inEnd, int postStart, int postEnd) {
        if(inStart <= inEnd && postStart <= postEnd) {
            pre[idx++] = post[postEnd]; // 포스트오더의 가장 오른쪽은 루트 노드
            int pos = inStart;
            for (int i = inStart; i <= inEnd; i++) {
                if (in[i] == post[postEnd]) {
                    pos = i;
                    break;
                }
            }

            // 왼쪽 자식 트리 반복
            getPreOrder(inStart,pos - 1, postStart, postStart + pos - inStart - 1);
            // 우측 자식 트리 반복
            getPreOrder(pos + 1, inEnd, postStart + pos - inStart, postEnd - 1);
        }
    }
}