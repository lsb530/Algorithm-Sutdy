package boj.steps.a28트리.트리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] parents;

    public static void main(String[] args) throws IOException {
        int idx = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            parents = new int[n + 1];
            for (int i = 1; i < n + 1; i++) {
                parents[i] = i;
            }
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                union(a, b);
            }
            HashSet<Integer> treeSet = new HashSet<>();
            for(int i = 1; i < n + 1; i++) {
                int ra = find(i);
                if(ra > 0) treeSet.add(ra);
            }
            int treeNum = treeSet.size();
            if(treeNum == 0) {
                sb.append("Case " + idx +": ").append("No trees.\n");
            }else if(treeNum ==1) {
                sb.append("Case " + idx +": ").append("There is one tree.\n");
            }else if(treeNum >1){
                sb.append("Case " + idx +": ").append("A forest of "+ treeNum+" trees.\n");
            }
            idx++;
        }
        System.out.println(sb);
    }

    static int find(int x) { // 부모 노드를 찾는 함수
        if(parents[x] == x) return x;
        return find(parents[x]);
    }

    static void union(int x, int y) {
        int rx = find(x);
        int ry = find(y);
        if(rx > ry) {
            int temp = rx;
            rx = ry;
            ry = temp;
        }
        // cycle
        if(rx == ry) parents[rx] = 0;
        else parents[ry] = rx;
    }

    static void basicUnion(int a, int b) {
        a = find(a);
        b = find(b);
        if(a != b) parents[b] = a;
    }

}