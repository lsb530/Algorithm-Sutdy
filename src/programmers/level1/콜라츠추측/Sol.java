package programmers.level1.콜라츠추측;

public class Sol {
    /*
1-1. 입력된 수가 짝수라면 2로 나눕니다.
1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.
예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수,
solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
     */
    public int solution(int num) {
        if (num == 1) return 0;
        long n = num;
        int answer = 0;
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            answer++;
        }
        return answer >= 500 ? -1 : answer;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(6));
        System.out.println(s.solution(16));
        System.out.println(s.solution(626331));
    }
}
