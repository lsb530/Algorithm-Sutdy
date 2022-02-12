package programmers.devMaching3nd.p1;

import java.util.LinkedList;
import java.util.Queue;

class Pair {

    int x, y;
    char ch;

    public Pair(int x, int y, char ch) {
        this.x = x;
        this.y = y;
        this.ch = ch;
    }
}

public class Solution {

    static int answer = 0;
    static int asterRiskCnt = 0;
    static char[][] chars;

    public static int solution(String[] drum) {
        chars = new char[drum.length][drum.length];
        for (int i = 0; i < drum.length; i++) {
            for (int j = 0; j < drum[0].length(); j++) {
                chars[i][j] = drum[i].charAt(j);
//                System.out.print(chars[i][j] + " ");
            }
//            System.out.println();
        }
        for (int i = 0; i < chars.length; i++) {
            if (go(new Pair(0, i, chars[0][i]))) {
                answer++;
            }
            asterRiskCnt = 0;
        }
        System.out.println(answer);
        return answer;
    }

    public static boolean go(Pair start) {
        Queue<Pair> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            if (cur.ch == '#') {
                if(cur.x == chars.length - 1) return true;
                queue.add(new Pair(cur.x + 1, cur.y, chars[cur.x + 1][cur.y]));
            } else if (cur.ch == '>') {
                queue.add(new Pair(cur.x, cur.y + 1, chars[cur.x][cur.y + 1]));
            } else if (cur.ch == '<') {
                queue.add(new Pair(cur.x, cur.y - 1, chars[cur.x][cur.y - 1]));
            } else if (cur.ch == '*') {
                asterRiskCnt++;
                if(asterRiskCnt == 2) return false;
                if(cur.x == chars.length - 1) return true;
                queue.add(new Pair(cur.x + 1, cur.y, chars[cur.x + 1][cur.y]));
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] drum = {"######", ">#*###", "####*#", "#<#>>#", ">#*#*<", "######"};
        solution(drum);
    }
}