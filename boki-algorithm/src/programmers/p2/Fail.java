package programmers.p2;

import java.util.LinkedList;
import java.util.Queue;

public class Fail {

    static class Pair {
        int x, y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static public int[] solution(String[][] places) {
        int[] dx = {0, -1, 1, 0, -1, 1, -1, 1};
        int[] dy = {1, 0, 0, -1, 1, 1, -1, -1};

        int len = places[0].length;
        int[] answers = new int[5];
        for (int k = 0; k < places.length; k++) {
            Queue<Pair> queue = new LinkedList<>();
            // 여기부터
            for (int i = 0; i < len; i++) {
                for (int j = 0; j < 5; j++) {
                    if (places[k][i].charAt(j) == 'P') {
                        queue.offer(new Pair(i, j));
                    }
//                    System.out.print(places[k][i].charAt(j) + " ");
                }
//                System.out.println();
            }
//            System.out.println("\nQueue");
            int answer = 1; // 거리두기가 안되어 있다고 가정
            while (!queue.isEmpty()) {
                Pair coordinates = queue.poll();
                int x = coordinates.x;
                int y = coordinates.y;
//                System.out.println(coordinates.x + ", " + coordinates.y);
                boolean flag = false;
                // 1. 상하좌우에 P가 존재하면 false & return
                // 2. 대각선에 P가 존재하면 원래 위치에서 상하좌우 탐색해서
                // 한개라도 O가 존재하면 false & return
                for (int a = 0; a < 4; a++) { // 상하좌우
                    int nx = x + dx[a];
                    int ny = y + dy[a];
                    if (0 <= nx && nx < 5 && 0 <= ny && ny < 5) {
                        if (places[k][nx].charAt(ny) == 'P') {
                            flag = true;
                            answer = 0;
                            break;
                        }
                    }
                }
                if (flag) continue;
                for (int b = 4; b < 8; b++) { // 대각선
                    int nx = x + dx[b];
                    int ny = y + dy[b];
                    if (0 <= nx && nx < 5 && 0 <= ny && ny < 5) {
                        // 대각선에서 P를 발견한 경우
                        if (places[k][nx].charAt(ny) == 'P') {
                            if(dx[b] > 0 && dy[b] > 0) { // 1,1
                                // (0, 1), (1, 0)
                                char charA = places[k][nx - 1].charAt(ny); // (0, 1)
                                char charB = places[k][nx].charAt(ny - 1); // (1, 0)
                                if (charA == 'O' || charB == 'O') {
                                    answer = 0;
                                    break;
                                }
                            } else if(dx[b] > 0 && dy[b] < 0) { // 1, -1
                                // (1, 0), (0, -1)
                                char charA = places[k][nx].charAt(ny + 1); // (1, 0)
                                char charB = places[k][nx - 1].charAt(ny); // (0, -1)
                                if (charA == 'O' || charB == 'O') {
                                    answer = 0;
                                    break;
                                }
                            } else if(dx[b] < 0 && dy[b] > 0) { // -1, 1
                                // (0, 1), (-1, 0)
                                char charA = places[k][nx + 1].charAt(ny);
                                char charB = places[k][nx].charAt(ny - 1);
                                if (charA == 'O' || charB == 'O') {
                                    answer = 0;
                                    break;
                                }
                            } else { // -1, -1
                                // (-1, 0), (0, -1)
                                char charA = places[k][nx].charAt(ny + 1);
                                char charB = places[k][nx + 1].charAt(ny);
                                if (charA == 'O' || charB == 'O') {
                                    answer = 0;
                                    break;
                                }
                            }
//                            for (int a = 0; a < 4; a++) { // 상하좌우
//                                int mx = x + dx[a];
//                                int my = y + dy[a];
//                                if (0 <= mx && mx < 5 && 0 <= my && my < 5) {
//                                    if (places[k][mx].charAt(my) == 'O') {
//                                        answer = 0;
//                                        break;
//                                    }
//                                }
//                            }
                        }
                    }
                }
                // 여기까지가 처리하는 로직
//                System.out.println();
            }
            answers[k] = answer;
        }
        return answers;
    }

    public static void main(String[] args) {
        // X: 파티션, O: 책상
        // PXP => T
        // PX => T
        // XP
        // PX => F
        // OP
        String[][] places = {
            {"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"},
            {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"},
            {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"},
            {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"},
            {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}
        };
        // 상하좌우 , 대각선 (0~3까지는 상하좌우, 4~7까지는 대각선)
        int[] answers = solution(places);
        for (int i = 0; i < answers.length; i++) {
            System.out.println(answers[i] + " ");
        }
    }
}