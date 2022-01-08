package 연습.배열;

import java.util.stream.IntStream;

public class 카운팅배열 {

    static int[] cntArr;

    public static void main(String[] args) {
        int SIZE = 1000;
        int[] randomArr = IntStream.generate(() -> (int) (Math.random() * SIZE + 1))
            .limit(100)
            .toArray();
        cntArr = new int[1000];
        for (int i : randomArr) {
            cntArr[i]++;
//            System.out.print(i + " ");
        }
        for (int i = 0; i < cntArr.length; i++) {
            if(cntArr[i] == 0) continue;
            System.out.printf("[%d의 개수 %d] ", i, cntArr[i]);
        }
    }
}