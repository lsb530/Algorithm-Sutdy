package util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.stream.IntStream;

public interface ArrayUtil {

    static void print(int[] arr) {
        for (int o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static void print(String info, ArrayList<Integer> arr) {
        System.out.print(info + ": ");
        for (Integer o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static void print(ArrayList<Integer> arr) {
        for (Integer o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    static int[] create(int MAX, int SIZE) {
//        return IntStream.generate(() -> (int) (Math.random() * MAX + 1))
        return IntStream.generate(() -> new Random().nextInt(MAX) + 1)
            .limit(SIZE)
            .toArray();
    }

    static int[] createDistinct(int MAX, int SIZE) {
        return IntStream.generate(() -> new Random().nextInt(MAX) + 1)
            .limit(SIZE)
            .distinct()
            .toArray();
    }

    static int[] createNegative(int MAX, int SIZE) {
        int[] positiveOrNegative = IntStream.generate(() -> new Random().nextInt(2))
            .limit(SIZE)
            .map(v -> v == 0 ? -1 : 1)
            .toArray();
        int[] arr = IntStream.generate(() -> new Random().nextInt(MAX) + 1)
            .limit(SIZE)
            .toArray();
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= positiveOrNegative[i];
        }
        return arr;
    }
}