package programmers.devMaching3nd.p3;

public class Solution {

    static Character[][] keyboard = new Character[][]{{'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o'},
        {'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k'},
        {'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm', null}};
    static boolean[] visit;

    static char[] temp;

    public static int solution(String s) {
        visit = new boolean[s.length()];
        temp = new char[s.length()];
        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < keyboard[0].length; j++) {
                System.out.print(keyboard[i][j] + " ");
            }
            System.out.println();
        }
        dfs(0, s);
        int answer = -1;
        return answer;
    }

    public static void dfs(int depth, String s) {
        for (char c : temp) {
            System.out.print(c);
        }
        System.out.println();
        if (depth == s.length()) {
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!visit[i]) {
                temp[depth] = s.charAt(i);
                dfs(depth + 1, s);
                visit[i] = true;
            }
        }
    }

    public static void main(String[] args) {
        solution("abcc");
    }
}