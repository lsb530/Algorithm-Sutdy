package 연습.경우의수.백트래킹;

import java.util.Arrays;
import java.util.Stack;

public class 부분집합구하기 {

    static int[] arr = {1, 2, 3};
    static int cnt;
    static int max_cnt;
    // 각 부분 집합을 저장할 배열
    static int[] subset;

    static boolean[] visited;

    private static final char[] characters = {'A', 'B', 'C', 'D', 'E'};

    public static void main(String[] args) {
        visited = new boolean[arr.length];
        final int end = 3;
        powerSet(end);
        System.out.println(cnt);
        cnt = 0;
        powerSetRecur(0);
        System.out.println(cnt);
//        final Stack<Character> stack = new Stack<>();
//        search(stack, 0);
//        System.out.println(cnt);
    }

    private static void powerSet(int end) {
        // 원소를 선택하는 개수 0 ~ 3개.
        for (int i = 0; i <= end; i++) {
            max_cnt = i;
            subset = new int[i];
            // 대상 집합에서 원소를 0 ~ 3개를 선택하는 조합을 모두 구한다.
            combination(0, 0);
            System.out.println();
        }
    }

    private static void powerSetRecur(int depth) {
        // 3개의 숫자에 대한 선택을 완료 하였다면, 선택된 숫자들을 출력한다.
        // 선택된 각 숫자들은 대상 배열의 '부분 집합'이다!
        if (depth == arr.length) {
            for (int i = 0; i < arr.length; i++) {
                // 숫자가 선택 되었다면 출력한다.
                if (visited[i]) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
            cnt++;
            return;
        }

        // 해당 숫자를 선택하고 재귀를 진행한다.
        visited[depth] = true;
        powerSetRecur(depth + 1);
        // 해당 숫자를 선택하지 않고 재귀를 진행한다.
        visited[depth] = false;
        powerSetRecur(depth + 1);
    }

    private static void combination(int depth, int start) {
        if (depth == max_cnt) {
            cnt++;
            System.out.print(Arrays.toString(subset) + " ");
            return;
        }
        for (int i = start; i < arr.length; i++) {
            subset[depth] = arr[i];
            combination(depth + 1, i + 1);
        }
    }

    private static void search(Stack<Character> stack, int k) {
        if (k >= characters.length) {
            cnt++;
            System.out.println(stack.toString());
        } else {
            stack.push(characters[k]);
            search(stack, k + 1);
            stack.pop();
            search(stack, k + 1);
        }
    }
}