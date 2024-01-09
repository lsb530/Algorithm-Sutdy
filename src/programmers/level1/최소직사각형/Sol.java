package programmers.level1.최소직사각형;

import java.util.Arrays;

public class Sol {
    public int solution(int[][] sizes) {
        // 모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return
        /*
        가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
        하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다.
        이때의 지갑 크기는 4000(=80 x 50)입니다.
         */
        int w = 0, h = 0;
        for (int[] size : sizes) {
            w = Math.max(Math.max(size[0], size[1]), w);
            h = Math.max(Math.min(size[0], size[1]), h);
            System.out.printf("v = %d, h = %d\n", w, h);
        }
        return w * h;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        int[][] arr1 = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] arr2 = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] arr3 = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};
        System.out.println(s.solution(arr1));
        System.out.println(s.solution(arr2));
        System.out.println(s.solution(arr3));
    }
}
