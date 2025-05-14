package programmers.level1.삼총사;

public class Solution {

    int solAnswer = 0;

    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public void dfs(int[] numbers, int idx, int sum, int cnt) {
        if (cnt == 3 && sum == 0) {
            solAnswer += 1;
            return;
        }

        for (int i = idx; i < numbers.length; i++) {
            dfs(numbers, i + 1, sum + numbers[i], cnt + 1);
        }
    }

    public int solution2(int[] number) {
        for (int i = 0; i < number.length; i++) {
            dfs(number, i + 1, number[i],1);
        }
        return solAnswer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        System.out.println(s.solution(new int[]{-2, 3, 0, 2, -5})); // 2
//        System.out.println(s.solution(new int[]{-3, -2, -1, 0, 1, 2, 3})); // 5
//        System.out.println(s.solution(new int[]{-1, 1, -1, 1})); // 0
        System.out.println(s.solution2(new int[]{-2, 3, 0, 2, -5})); // 2
        s.solAnswer = 0;
        System.out.println(s.solution2(new int[]{-3, -2, -1, 0, 1, 2, 3})); // 5
        s.solAnswer = 0;
        System.out.println(s.solution2(new int[]{-1, 1, -1, 1})); // 0
    }
}
