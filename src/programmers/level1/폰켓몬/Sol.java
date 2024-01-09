package programmers.level1.폰켓몬;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sol {

    public int solution(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> set = new HashSet<>();
            set.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if (set.size() != nums.length / 2) {
                    set.add(nums[j]);
                }
                else {
                    max = Math.max(max, set.size());
                    set.clear();
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(new int[]{3, 1, 2, 3}));
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 4}));
        System.out.println(s.solution(new int[]{3, 3, 3, 2, 2, 2}));
    }
}
