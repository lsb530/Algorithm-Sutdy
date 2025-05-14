package programmers.level1.키패드누르기;

import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand1 = "right";
        solution(numbers1, hand1);
        int[] numbers2 = new int[]{7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand2 = "left";
        solution(numbers2, hand2);
        int[] numbers3 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String hand3 = "right";
        solution(numbers3, hand3);
    }

    static class Pair {
        int x; int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setPos(Pair p) {
            this.x = p.x;
            this.y = p.y;
        }

        @Override
        public String toString() {
            return "Pair{" +
                "x=" + x +
                ", y=" + y +
                '}';
        }
    }

    public static String solution(int[] numbers, String hand) {
        int[][] phone = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        HashMap<Integer, Pair> phoneNum = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                phoneNum.put(phone[i][j], new Pair(i, j));
            }
        }
        phoneNum.put(0, new Pair(3, 1));

        Pair left = new Pair(3,0);
        Pair right = new Pair(3,2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int input = numbers[i];
            Pair cur = phoneNum.get(numbers[i]);
            if(input == 1 || input == 4 || input == 7) {
                left.setPos(cur);
                sb.append('L');
            } else if (input == 3 || input == 6 || input == 9) {
                right.setPos(cur);
                sb.append('R');
            } else {
                int left_distance = Math.abs(cur.x - left.x) + Math.abs(cur.y - left.y);
                int right_distance = Math.abs(cur.x - right.x) + Math.abs(cur.y - right.y);
                if(left_distance < right_distance) {
                    left.setPos(cur);
                    sb.append('L');
                } else if(left_distance > right_distance) {
                    right.setPos(cur);
                    sb.append('R');
                } else {
                    if("left".equals(hand)) {
                        left.setPos(cur);
                        sb.append('L');
                    } else {
                        right.setPos(cur);
                        sb.append('R');
                    }
                }
            }
//            System.out.printf("input = %d, left(x,y) = (%d, %d), right(x,y) = (%d, %d)\n", numbers[i], left.x, left.y, right.x, right.y);
        }
//        System.out.println(sb);
        return sb.toString();
    }
}