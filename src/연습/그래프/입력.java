package 연습.그래프;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
정점, 간선의 개수 이후
(노드, 노드, 비용)이 주어진 경우
5 6
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6
*/
public class 입력 {

    public static void main(String[] args) {
        인접행렬(false);
//        인접행렬(true);
//        인접리스트(false);
        인접리스트(true);
    }

    public static void 인접행렬(boolean bidirectional) {
        Scanner sc = new Scanner(System.in);
        // V = 정점의 개수, E = 간선의 개수.
        int V = sc.nextInt();
        int E = sc.nextInt();

        // 2차원 배열(인접 행렬)을 만든다.
        // 인덱스의 번호 = 노드의 번호 이기 때문에, 2차원 배열의 크기를 임의로 1 늘려서 정의한다(스킬).
        int[][] graph = new int[V + 1][V + 1];

        int row;
        int col;
        int cost;
        for (int i = 0; i < E; i++) {
            row = sc.nextInt();
            col = sc.nextInt();
            cost = sc.nextInt();
            graph[row][col] = cost; // 유향 그래프
            // 만일, 무향 그래프라면 반대의 상황도 추가해 준다.
            if (!bidirectional) {
                graph[col][row] = cost; // 무향 그래프
            }
        }

        // 인접 행렬 출력
        if (bidirectional) {
            System.out.println("방향성이 있는 그래프");
        } else {
            System.out.println("방향성이 없는(양방향) 그래프");
        }
        for (int i = 1; i < V + 1; i++) {
            for (int j = 1; j < V + 1; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
//        sc.close();
    }

    public static void 인접리스트(boolean bidirectional) {
        Scanner sc = new Scanner(System.in);
        // V = 정점의 개수, E = 간선의 개수.
        int V = sc.nextInt();
        int E = sc.nextInt();

        // 1차원 리스트를 만든다.
        // 인덱스의 번호 = 노드의 번호 이기 때문에, 1차원 리스트의 크기를 임의로 1 늘려서 정의한다(스킬).
        List<ArrayList<Node>> graph = new ArrayList<>();
        for (int i = 0; i < V + 1; i++) {
            graph.add(new ArrayList<>());
        }

        int a;
        int b;
        int cost;
        for (int i = 0; i < E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            cost = sc.nextInt();

            graph.get(a).add(new Node(b, cost));
            // 만일, 무향 그래프라면 반대의 상황도 추가해 준다.
            if (!bidirectional) {
                graph.get(b).add(new Node(a, cost));
            }
        }

        if (bidirectional) {
            System.out.println("방향성이 있는 그래프");
        } else {
            System.out.println("방향성이 없는(양방향) 그래프");
        }
        // 인접 행렬 출력
        System.out.println(graph);
//        sc.close();
    }

    static public class Node {

        int end; // 연결되는 정점
        int cost; // 비용

        Node(int end, int cost) {
            this.end = end;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return "[" + end + ", "
                + "" + cost + "]";
        }
    }
}