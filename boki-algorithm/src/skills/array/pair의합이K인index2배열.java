package skills.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class pair의합이K인index2배열 {

    @Test
    void test() {
        assertArrayEquals(solution(new int[]{1, 3, 2, 5, 6, 2, 3}, 5), new int[]{1, 2});
    }


    /*
        a + b = k
        1 3 2 5 ...  + b = 5
        k - a = b
        k - arr[i]

        1, 2
        1, 5
        2, 6
        5, 6
        2 * 2
     */

    public int[] solution(int arr[], int K) {
        if (arr.length == 0) {
            return null;
        }
        ArrayList<int[]> ans = new ArrayList<>();
        Set<Integer> chk = new HashSet<>();
        int[] answer = new int[2];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], new ArrayList<>());
        }
        for (int i = 0; i < arr.length; i++) {
            map.get(arr[i]).add(i);
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(K - arr[i]) && !chk.contains(arr[i])) { // 5 - 3이니깐 5-2의 경우에서 반대에서도 cnt++;
                answer[0] = i;
                answer[1] = map.get(K-arr[i]).get(0);
                chk.add(arr[i]);
                chk.add(K - arr[i]);
                cnt += map.get(arr[i]).size() * map.get(K - arr[i]).size(); // 경우의 수
                ans.add(answer);
            }
        }
        System.out.println("cnt = " + cnt);
        return answer;
    }
}