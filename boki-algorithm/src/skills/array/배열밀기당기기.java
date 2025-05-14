package skills.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class 배열밀기당기기 {

    @Test
    void test() {
        assertArrayEquals(arrayShiftRight(new int[]{1, 2, 3, 4, 5}, 1), new int[]{5, 1, 2, 3, 4});
        assertArrayEquals(arrayShiftRight(new int[]{1, 2, 3, 4, 5}, 3), new int[]{3, 4, 5, 1, 2});

        assertArrayEquals(arrayShiftRightEasy(new int[]{1, 2, 3, 4, 5}, 1), new int[]{5, 1, 2, 3, 4});
        assertArrayEquals(arrayShiftRightEasy(new int[]{1, 2, 3, 4, 5}, 3), new int[]{3, 4, 5, 1, 2});

        assertArrayEquals(arrayShiftLeft(new int[]{1, 2, 3, 4, 5}, 1), new int[]{2, 3, 4, 5, 1});
        assertArrayEquals(arrayShiftLeft(new int[]{1, 2, 3, 4, 5}, 3), new int[]{4, 5, 1, 2, 3});

        assertArrayEquals(arrayShiftLeftEasy(new int[]{1, 2, 3, 4, 5}, 1), new int[]{2, 3, 4, 5, 1});
        assertArrayEquals(arrayShiftLeftEasy(new int[]{1, 2, 3, 4, 5}, 3), new int[]{4, 5, 1, 2, 3});

        assertArrayEquals(arrayShiftLeftSwap(new int[]{1, 2, 3, 4, 5}, 1), new int[]{2, 3, 4, 5, 1});
        assertArrayEquals(arrayShiftLeftSwap(new int[]{1, 2, 3, 4, 5}, 2), new int[]{3, 4, 5, 1, 2});
        assertArrayEquals(arrayShiftLeftSwap(new int[]{1, 2, 3, 4, 5}, 4), new int[]{5, 1, 2, 3, 4});

        assertArrayEquals(arrayShiftRightSwap(new int[]{1, 2, 3, 4, 5}, 1), new int[]{5, 1, 2, 3, 4});
        assertArrayEquals(arrayShiftRightSwap(new int[]{1, 2, 3, 4, 5}, 2), new int[]{4, 5, 1, 2, 3});
        assertArrayEquals(arrayShiftRightSwap(new int[]{1, 2, 3, 4, 5}, 4), new int[]{2, 3, 4, 5, 1});
    }

    public int[] arrayShiftRight(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int last = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = last;
        }
        return arr;
    }

    public int[] arrayShiftLeft(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;
        }
        return arr;
    }

    public int[] arrayShiftRightEasy(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[(i + n) % arr.length] = arr[i];
        }
        return answer;
    }

    public int[] arrayShiftLeftEasy(int[] arr, int n) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int pos = i - (n % arr.length);
            if(pos >= 0)
                answer[pos] = arr[i];
            else
                answer[pos + arr.length] = arr[i];
        }
        return answer;
    }

    public int[] arrayShiftLeftSwap(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
        return arr;
    }

    public int[] arrayShiftRightSwap(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
        return arr;
    }
}