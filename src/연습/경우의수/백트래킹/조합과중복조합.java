package 연습.경우의수.백트래킹;

import java.util.Arrays;

public class 조합과중복조합 {
    // *조합(Combination) -> 조합이란, 임의의 집합을 순서가 없이 선택하는 것을 말한다.
    //Ex) 이를 테면 집합 {1, 2, 3}중 2개의 원소를 선택한 조합을 구하시오라고 하면
    // 결과는 {12, 13, 23} 총 3가지의 경우의 수가 나온다.
    static int[] arr = {1, 2, 3};
    static int[] result;
    static boolean[] visit;

    static int cnt;

    public static void main(String[] args) {
        visit = new boolean[arr.length];
        result = new int[arr.length];
        combination(0, 0);
        System.out.println(cnt);
        cnt = 0;
        System.out.println("-----------------");
        combination_duplicated(0,0);
        System.out.println(cnt);
    }

    private static void combination_re(int[] comArr, int n, int r, int index, int target) {
        if(r==0){
            for(int i : comArr){
                System.out.print(i+" ");
            }
            System.out.println();
            return;
        }
        if(target == n)return;
        comArr[index] = target;
        combination_re(comArr, n, r-1, index+1, target+1);//뽑는경우
        combination_re(comArr, n, r, index, target+1);//안뽑는경우
    }

    private static void combination(int depth, int start) {
        // 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
        if (depth == 3) {
            cnt++;
            System.out.println(Arrays.toString(result));
            Arrays.fill(result,0);
            return;
        }
        // 대상 집합을 주어진 인덱스부터 순회하며 숫자를 하나 선택한다.
        for (int i = start; i < 3; i++) {
            // 숫자를 담는다.
            result[depth] = arr[i];
            // 자신을 재귀 호출한다(자신 이전의 수를 중복 선택하지 않도록 인덱스를 +1하여 재귀를 호출한다).
            combination(depth + 1, i + 1);
        }
    }

    private static void combination_duplicated(int depth, int start) {
        // 2개를 선택했으므로, 결과를 출력하고 재귀를 종료한다.
        if (depth == 3) {
            cnt++;
            System.out.println(Arrays.toString(result));
            return;
        }
        // 대상 집합을 주어진 인덱스부터 순회하며 숫자를 하나 선택한다.
        for (int i = start; i < 3; i++) {
            // 숫자를 담는다.
            result[depth] = arr[i];
            // 자신을 재귀 호출한다(자신 이전의 수를 중복 선택하지 않도록 인덱스를 +1하여 재귀를 호출한다).
            combination_duplicated(depth + 1, i);
        }
    }

}