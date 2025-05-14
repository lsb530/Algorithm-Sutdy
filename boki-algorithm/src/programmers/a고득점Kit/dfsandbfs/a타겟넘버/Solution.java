package programmers.a고득점Kit.dfsandbfs.a타겟넘버;

public class Solution {

    public static int solution(int[] numbers, int target) {
        int answer = dfs(numbers, 0, 0, target);
        countRecursion(numbers, 0, 0, target);
        return answer;
    }

    public static int dfs(int[] numbers, int depth, int sum, int target) {
        if (depth == numbers.length) {
            if(target == sum) {
                System.out.printf("depth = %d, len = %d, sum = %d[O]\n", depth, numbers.length, sum);
                return 1;
            }
            else return 0;
        }
        else {
            System.out.printf("depth = %d, len = %d, sum = %d\n", depth, numbers.length, sum);
        }
//        int left = dfs(numbers, depth + 1, sum + numbers[depth], target);
//        int right = dfs(numbers, depth + 1, sum - numbers[depth], target);
//        System.out.printf("left = %d, right = %d\n", left, right);
        return dfs(numbers, depth + 1, sum + numbers[depth], target)
            + dfs(numbers, depth + 1, sum - numbers[depth], target);
    }

    public static void countRecursion(int[] numbers, int depth, int sum, int target) {
        int a = dfs(numbers, depth + 1, sum + numbers[depth], target);
        int b = dfs(numbers, depth + 1, sum - numbers[depth], target);
        System.out.println("left = " + a + ", right = " + b);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;
        int sol = solution(numbers, target);
        System.out.println("sol = " + sol);
    }
}