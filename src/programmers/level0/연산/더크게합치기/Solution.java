package programmers.코딩기초트레이닝.연산.더크게합치기;

class Solution {
    public int solution(int a, int b) {
        int x = Integer.parseInt(String.valueOf(a) + b);
        int y = Integer.parseInt(String.valueOf(b) + a);
        if (x > y || x == y) return x;
        return y;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(3, 20);
    }
}