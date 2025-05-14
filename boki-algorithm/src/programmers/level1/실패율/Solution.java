package programmers.level1.실패율;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Stage implements Comparable<Stage> {

    int idx;
    float failure;

    public Stage(int idx, float failure) {
        this.idx = idx;
        this.failure = failure;
    }

    @Override
    public int compareTo(Stage o) {
        if (o.failure == this.failure) {
            return Integer.compare(this.idx, o.idx);
        }
        return Float.compare(o.failure, this.failure);
    }

    @Override
    public String toString() {
        return this.idx + ", " + this.failure;
    }
}

public class Solution {

    public static void main(String[] args) {
        int N1 = 5;
        int[] stages1 = {2, 1, 2, 6, 2, 4, 3, 3};
        // [3,4,2,1,5]
        int[] sol1 = solution(N1, stages1);
        System.out.println(Arrays.toString(sol1));

        int N2 = 4;
//        int N2 = 5;
        int[] stages2 = {4, 4, 4, 4, 4};
//        int[] stages2 = {1, 2, 3, 2, 1};
        int[] sol2 = solution(N2, stages2);
        // [4,1,2,3]
        System.out.println(Arrays.toString(sol2));
    }

    // 실패율
    // 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
    public static int[] solution(int N, int[] stages) {
        // N: 스테이지 개수
        // key: 스테이지, val: >=key를 가진 값들의 개수++
        int[] unclear = new int[N + 1]; // 스테이지에 도달한 플레이어 수
        int[] clear = new int[N + 1];
        for (int i = 0; i < stages.length; i++) {
            unclear[stages[i] - 1]++;
        }
        int sum = 0;
        for (int i = 0; i < clear.length; i++) {
            clear[i] = stages.length - sum;
            sum += unclear[i];
        }
        ArrayList<Stage> data = new ArrayList<>();
        for (int i = 0; i < unclear.length - 1; i++) {
            if(clear[i] == 0) data.add(new Stage(i + 1, (float)0)); // clear[i] = 0
            else data.add(new Stage(i + 1, (unclear[i] / (float) clear[i])));
//            data.add(new Stage(i + 1, (unclear[i] / (float) clear[i])));
        }

        Collections.sort(data);

        int[] answer = new int[data.size()];
        for (int i = 0; i < data.size(); i++) {
            answer[i] = data.get(i).idx;
        }
        return answer;
    }
}