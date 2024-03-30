import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrTest {
    @DisplayName("기본 배열 사용")
    @Test
    void test() {
        int[] arr1 = {0, 0, 0, 0, 0, 0};
        int[] arr2 = new int[6];

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Assertions.assertArrayEquals(arr1, arr2);
    }

    @DisplayName("2차원 배열")
    @Test
    void test2() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(arr[1][2]); // 6
        arr[1][2] = 7;
        System.out.println(arr[1][2]); // 7
    }

    @DisplayName("ArrayList")
    @Test
    void test3() {
        ArrayList<Integer> list = new ArrayList<>();
        // 리스트의 맨 끝에 데이터 추가
        list.add(1); // [1]
        list.add(2); // [1, 2]
        list.add(3); // [1, 2, 3]

        // 다른 컬렉션의 데이터로부터 초기화
        ArrayList<Integer> list2 = new ArrayList<>(list);
        System.out.println(list2); // [1, 2, 3]

        // get() 메서드로 인덱스를 통해 데이터에 접근
        System.out.println(list.get(1)); // 2

        // remove() 메서드로 데이터 삭제
        list.remove(list.size() - 1); // 끝에 있는 데이터 삭제
        System.out.println(list); // [1, 2]
    }

    @DisplayName("배열 관련 메서드")
    @Test
    void test4() {
        int[] arr = {1, 2, 4, 5, 3};
        System.out.println(arr.length); // 5
        Arrays.sort(arr); // 정렬 [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(arr)); // 출력 [1, 2, 3, 4, 5]
    }

    @DisplayName("ArrayList 관련 메서드")
    @Test
    void test5() {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        System.out.println(list.size()); // 5
        System.out.println(list.isEmpty()); // false
        Collections.sort(list); // 정렬 [1, 2, 3, 4, 5]
        System.out.println(list); // 출력 [1, 2, 3, 4, 5]
    }
}
