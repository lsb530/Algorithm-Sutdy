package study.sort;

import static util.ANSI_COLOR.BLUE;
import static util.ANSI_COLOR.CYAN;
import static util.ANSI_COLOR.PURPLE;
import static util.ANSI_COLOR.YELLOW;
import static util.ColorInfo.print;

import java.util.stream.IntStream;
import util.StopWatch;

/**
 * see <a href="https://visualgo.net/ko/sorting"> 소트 </a>
 */
public class Sort {

    private static final StopWatch stopWatch = new StopWatch();
    private static int[] randomArr;
    private static int[] arr;

    public static void initArr() {
//        arr = new int[]
//            {3, 6, 41, 2, 4, 1, 5, 743, 30};
        arr = randomArr.clone();
    }

    public static void printArr() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
//        final long SIZE = 100_000;
//        final long SIZE = 50_000;
//        final long SIZE = 1_000;
        final long SIZE = 300;
//        final long SIZE = 8;
        randomArr = IntStream.generate(() -> (int) (Math.random() * SIZE + 1))
            .limit(SIZE)
            .distinct()
            .toArray();

        initArr();
        stopWatch.start();
        print(CYAN, "버블정렬");
        bubbleSort(arr);
        stopWatch.stop();
//        printArr();

        print(BLUE, "개선된 버블정렬");
        initArr();
        stopWatch.start();
        improvedBubbleSort(arr);
        stopWatch.stop();
//        printArr();

        print(YELLOW, "선택정렬");
        initArr();
        stopWatch.start();
        selectionSort(arr);
        stopWatch.stop();
//        printArr();

        print(PURPLE, "삽입정렬");
        initArr();
        stopWatch.start();
        insertionSort(arr);
        stopWatch.stop();
        printArr();
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * 버블정렬 <br/> 시간복잡도 <br/> 최악: O(n*(n-1)/2), <font color="yellow">최선: O(n²)</font>, <font
     * color="green">평균: O(n²)</font> <br/> 비교정렬, in-place 정렬(제자리정렬), 안정정렬 <br/>
     *
     * @see <a href=https://st-lab.tistory.com/195"> 참고 </a>
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 차이가 없다
//            for (int j = 0; j < arr.length - 1; j++) { // j+1
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 정렬할때마다 가장 끝에 i만큼 가장 큰 수가 정렬됨
                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j + 1];
//                    arr[j + 1] = arr[j];
//                    arr[j] = temp;
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 개선된버블정렬 <br/> 시간복잡도 <br/> 최악: O(n*(n-1)/2), <font color="red">최선: O(N)</font>, <font
     * color="green">평균: O(n²)</font> <br/> 비교정렬, in-place 정렬(제자리정렬), 안정정렬 <br/>
     *
     * @see <a href=https://st-lab.tistory.com/195"> 참고 </a>
     */
    public static void improvedBubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - 1; j++) { // j+1
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break; // 스왑된 적이 없다면 이미 정렬되었다는 의미
            }
        }
    }

    /**
     * 선택정렬 <br/> 시간복잡도 <br/> 최악: O(n²), <font color="yellow">최선: O(n²)</font>, <font
     * color="green">평균: O(n²)</font> <br/> 비교정렬, in-place 정렬(제자리정렬), 불안정정렬 <br/>
     *
     * @see <a href=https://st-lab.tistory.com/168?category=892973"> 참고 </a>
     */
    public static void selectionSort(int[] arr) {
        /*
        1. 주어진 리스트에서 최솟값을 찾는다.
        2. 최솟값을 맨 앞 자리의 값과 교환한다.
        3. 맨 앞 자리를 제외한 나머지 값들 중 최솟값을 찾아 위와 같은 방법으로 반복한다.
         */
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            int min_index = i;

            // 최솟값을 갖고있는 인덱스 찾기
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }

            }
            // i번째 값과 찾은 최솟값을 서로 교환
            swap(arr, min_index, i);
        }
    }

    /**
     * 삽입정렬 <br/> 시간복잡도 <br/> 최악: O(n²), <font color="yellow">최선: O(n)</font>, <font
     * color="green">평균: O(n²)</font> <br/> 비교정렬, in-place 정렬(제자리정렬), 안정정렬 <br/>
     *
     * @see <a href=https://st-lab.tistory.com/179?category=892973"> 참고 </a>
     */
    public static void insertionSort(int[] arr) {
        /*
        1. 현재 타겟이 되는 숫자와 이전 위치에 있는 원소들을 비교한다. (첫 번째 타겟은 두 번째 원소부터 시작한다.)
        2. 타겟이 되는 숫자가 이전 위치에 있던 원소보다 작다면 위치를 서로 교환한다.
        3. 그 다음 타겟을 찾아 위와 같은 방법으로 반복한다.
         */
        int size = arr.length;
        for (int i = 1; i < size; i++) {
            // 타겟 넘버
            int target = arr[i];
            int j = i - 1;

            // 타겟이 이전 원소보다 크기 전 까지 반복
            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];    // 이전 원소를 한 칸씩 뒤로 미룬다.
                arr[1] = arr[0];
                j--;
            }

            /*
             * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
             * 타겟 원소는 j번째 원소 뒤에 와야한다.
             * 그러므로 타겟은 j + 1 에 위치하게 된다.
             */
            arr[j + 1] = target;
        }

    }
}