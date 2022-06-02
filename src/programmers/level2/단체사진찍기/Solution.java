package programmers.level2.단체사진찍기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    // 각각 어피치, 콘, 프로도, 제이지, 무지, 네오, 라이언, 튜브}
    static Character[] friends = {'A', 'C', 'F', 'J', 'M', 'N', 'R', 'T'};
    static boolean[] visit;
    static int cnt;
    static Character[] line;

    static ArrayList<String> condition;

    public static int solution(int n, String[] data) {
        line = new Character[8];
        cnt = 0;
        visit = new boolean[friends.length];
        condition = new ArrayList<>();
        condition.addAll(List.of(data));
        dfs(0, friends.length);
//        System.out.println(cnt);
        return cnt;
    }

    public static boolean isAble(Character[] names) {
        List<Character> collect = Arrays.stream(names).collect(Collectors.toList());
        boolean flag = false;
        for (String s : condition) {
            for (int i = 0; i < s.length(); i++) {
                char me = s.charAt(0);
                char target = s.charAt(2);
                char op = s.charAt(3);
                int distance = s.charAt(4) - '0' + 1;
                int i_me = collect.indexOf(me);
                int i_target = collect.indexOf(target);
                if (op == '>') {
                    flag = Math.abs(i_me - i_target) > distance;
                } else if (op == '<') {
                    flag = Math.abs(i_me - i_target) < distance;
                } else {
                    flag = Math.abs(i_me - i_target) == distance;
                }
                if (!flag) {
                    return false;
                }
            }
        }
        return flag;
    }

    public static void dfs(int depth, int n) {
        if (depth == n) {
//            cnt++;
//            for (int i = 0; i < n; i++) {
//                System.out.print(line[i] + " ");
//            }
            if (isAble(line)) {
                cnt++;
//                System.out.print("(O)");
            }
//            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                visit[i] = true;
                line[depth] = friends[i];
                dfs(depth + 1, n);
                visit[i] = false;
            }
        }
    }
    // 순열, 중복순열, 조합, 중복조합

    public static void main(String[] args) {
        int n1 = 2;
        String[] data1 = {"N~F=0", "R~T>2"};
        solution(n1, data1);

        int n2 = 2;
        String[] data2 = {"M~C<2", "C~M>1"};
        solution(n2, data2);
    }
}