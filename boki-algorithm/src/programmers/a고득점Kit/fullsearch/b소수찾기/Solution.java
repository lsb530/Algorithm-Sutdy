package programmers.a고득점Kit.fullsearch.b소수찾기;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    static int answer = 0;
    static boolean[] prime;
    static int[] arr = new int[8];
    static boolean[] visit = new boolean[8];
    static Set<Integer> check = new HashSet<>();

    public static int solution(String numbers) {
        answer = 0;
        Integer[] a = new Integer[numbers.length()];
        for (int i = 0; i < numbers.length(); i++) {
            a[i] = numbers.charAt(i) - '0';
        }
        Arrays.sort(a, Collections.reverseOrder()); // 7 1 1
        StringBuilder r = new StringBuilder();
        for (Integer integer : a) {
            r.append(integer.toString());
        }
        System.out.println("r = " + r);
        int len = Integer.parseInt(r.toString());
        prime = new boolean[len + 1]; // 0
        Eratostenes(len);
//        for (int i = 0; i <= len; i += 1) {
//            if (prime[i]) {
//                System.out.print(i + " ");
//            }
//        }
        for (int i = 1; i <= numbers.length(); i++) {
            dfs(0, i, numbers);
        }
        return answer;
    }

    public static void dfs(int depth, int end, String numbers) {
        if (depth == end) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < end; i++) {
                if(arr[0] == 0) return;
                sb.append(arr[i]);
            }
//            System.out.println(sb);
            int num = Integer.parseInt(sb.toString());
            if(prime[num] && !check.contains(num)) {
                check.add(num);
//                System.out.println("소수 = " + sb);
                answer++;
            }
            return;
        }

        for (int i = 0; i < numbers.length(); i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = numbers.charAt(i) - '0';
                dfs(depth + 1, end, numbers);
                visit[i] = false;
            }
        }
    }

    public static void Eratostenes(int len) {
        prime[0] = prime[1] = false;
        for (int i = 2; i <= len; i += 1) {
            prime[i] = true;
        }
        for (int i = 2; i * i <= len; i += 1) {
            for (int j = i * i; j <= len; j += i) {
                prime[j] = false;        //2를 제외한 2의 배수 false
            }
        }
    }

    public static void main(String[] args) {
        String numbers1 = "17";
        int sol1 = solution(numbers1);
        System.out.println("sol1 = " + sol1);
        String numbers2 = "011";
        int sol2 = solution(numbers2);
        System.out.println("sol2 = " + sol2);
    }
}