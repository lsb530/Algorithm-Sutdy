package study.sort;

import static util.ANSI_COLOR.BLUE;
import static util.ANSI_COLOR.CYAN;
import static util.ANSI_COLOR.PURPLE;
import static util.ANSI_COLOR.YELLOW;
import static util.ColorInfo.print;
import static util.ColorInfo.rprint;

import java.util.PriorityQueue;
import java.util.stream.IntStream;
import util.StopWatch;

/**
 * see <a href="https://visualgo.net/ko/sorting"> 소트 </a>
 */
public class Sort {

    private static final StopWatch stopWatch = new StopWatch();
    private static int[] randomArr;
    private static int[] arr;
    private static int[] sorted;
    private static int count;

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
//        final long SIZE = 1_000_000;
//        final long SIZE = 100_000;
//        final long SIZE = 50_000;
        final long SIZE = 10_000;
//        final long SIZE = 1_000;
//        final long SIZE = 300;
//        final long SIZE = 10;
//        final long SIZE = 5;
        randomArr = IntStream.generate(() -> (int) (Math.random() * SIZE + 1))
            .limit(SIZE)
            .distinct()
            .toArray();
        sorted = new int[(int) SIZE];
        print("크기: " + SIZE);
        rprint("시간복잡도 O(n²)인 정렬들: 버블/선택/삽입");
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

        rprint("\n시간복잡도 O(NlogN)인 정렬들: 병합/힙/퀵/트리");
        print(CYAN, "병합정렬");
        initArr();
        stopWatch.start();
        mergeSort(arr, 0, arr.length - 1);
        print("count : " + count);
        stopWatch.stop();

        print(BLUE, "힙정렬");
        initArr();
        stopWatch.start();
        basicHeapSort(arr);
        stopWatch.stop();

        print(YELLOW, "힙정렬2(최대힙)");
        initArr();
        stopWatch.start();
        maxHeapSort(arr);
        stopWatch.stop();

        print(PURPLE, "퀵정렬");
        initArr();
        stopWatch.start();
        quickSort(arr);
        stopWatch.stop();

        print("트리정렬");
        initArr();
        stopWatch.start();
        treeSort(arr);
        stopWatch.stop();
//        printArr();
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
            for (int j = 0; j < arr.length - i - 1; j++) { // j+1
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

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end) {
            count++;
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid); // divide and conquer
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i, j, k, l;
        i = start; // 시작 임시 인덱스 값
        j = mid + 1; // 중간 임시 인덱스 값
        k = start; // 시작 임시 인덱스 값(임시 배열 index 의 역할)

        while (i <= mid && j <= end) { // 앞 배열과 뒷 배열 중 먼저 쫑나는 배열이 있을 떄 까지 반복
            if (arr[i] <= arr[j]) {
                sorted[k++] = arr[i++];
            } else {
                sorted[k++] = arr[j++];
            }
        }

        /*앞 배열이던 뒷 배열이던 먼저 쫑나지 않은 배열의 남은 값(정렬된 값)을 임시 배열에 넣는 작업*/
        if (i <= mid) {
            for (l = i; l <= mid; l++) {
                sorted[k++] = arr[l];
            }
        } else {
            for (l = j; l <= end; l++) {
                sorted[k++] = arr[l];
            }
        }

        /*if(i > mid) for(l = j; l <= end; l++) sorted[k++] = arr[l];
        else for(l = i; l <= mid; l++) sorted[k++] = arr[l];*/

        /*정렬된 임시 배열을 완성된 부분 배열로*/
        for (l = start; l <= end; l++) {
            arr[l] = sorted[l];
        }
    }

    private static void basicHeapSort(int[] arr) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            heap.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = heap.poll();
        }
    }

    private static void maxHeapSort(int[] arr) {

        /*
         * 부모노드와 heaify과정에서 음수가 발생하면 잘못 된 참조가 발생하기 때문에
         * 원소가 1개이거나 0개일 경우는 정렬 할 필요가 없으므로 바로 함수를 종료한다.
         */
        if (arr.length < 2) {
            return;
        }

        /*
         * left child node = index * 2 + 1
         * right child node = index * 2 + 2
         * parent node = (index - 1) / 2
         */

        // 가장 마지막 요소의 부모 인덱스
        int parentIdx = getParent(arr.length - 1);

        // max heap
        for (int i = parentIdx; i >= 0; i--) {
            heapify(arr, i, arr.length - 1);
        }

        // 오름차순
        for (int i = arr.length - 1; i > 0; i--) {
            /*
             *  root인 0번째 인덱스와 i번째 인덱스의 값을 교환해준 뒤
             *  0 ~ (i-1) 까지의 부분트리에 대해 max heap을 만족하도록
             *  재구성한다.
             */
            swap(arr, 0, i);
            heapify(arr, 0, i - 1);
        }
    }

    // 부모 인덱스를 얻는 함수
    private static int getParent(int child) {
        return (child - 1) / 2;
    }

    // 힙을 만들어줌
    private static void heapify(int[] a, int parentIdx, int lastIdx) {

        int leftChildIdx;
        int rightChildIdx;
        int largestIdx;

        /*
         * 현재 부모 인덱스의 자식 노드 인덱스가
         * 마지막 인덱스를 넘지 않을 때 까지 반복한다.
         *
         * 이 때 왼쪽 자식 노드를 기준으로 해야 한다.
         * 오른쪽 자식 노드를 기준으로 범위를 검사하게 되면
         * 마지막 부모 인덱스가 왼쪽 자식만 갖고 있을 경우
         * 왼쪽 자식노드와는 비교 및 교환을 할 수 없기 때문이다.
         */
        while ((parentIdx * 2) + 1 <= lastIdx) {
            leftChildIdx = (parentIdx * 2) + 1;
            rightChildIdx = (parentIdx * 2) + 2;
            largestIdx = parentIdx;

            /*
             * left child node와 비교
             * (범위는 while문에서 검사했으므로 별도 검사 필요 없음)
             */
            if (a[leftChildIdx] > a[largestIdx]) {
                largestIdx = leftChildIdx;
            }

            /*
             * right child node와 비교
             * right child node는 범위를 검사해주어야한다.
             */
            if (rightChildIdx <= lastIdx && a[rightChildIdx] > a[largestIdx]) {
                largestIdx = rightChildIdx;
            }

            /*
             * 교환이 발생했을 경우 두 원소를 교체 한 후
             * 교환이 된 자식노드를 부모 노드가 되도록 교체한다.
             */
            if (largestIdx != parentIdx) {
                swap(a, parentIdx, largestIdx);
                parentIdx = largestIdx;
            } else {
                return;
            }
        }
    }

    public static void quickSort(int[] a) {
        l_pivot_sort(a, 0, a.length - 1);
    }

    /**
     *  왼쪽 피벗 선택 방식
     * @param a		정렬할 배열
     * @param lo	현재 부분배열의 왼쪽
     * @param hi	현재 부분배열의 오른쪽
     */
    private static void l_pivot_sort(int[] a, int lo, int hi) {

        /*
         *  lo가 hi보다 크거나 같다면 정렬 할 원소가
         *  1개 이하이므로 정렬하지 않고 return한다.
         */
        if(lo >= hi) {
            return;
        }

        /*
         * 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 정렬 된 상태로
         * 만들어 준 뒤, 최종적으로 pivot의 위치를 얻는다.
         *
         * 그리고나서 해당 피벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
         * 분할 정복을 해준다.
         *
         * [과정]
         *
         * Partitioning:
         *
         *   a[left]          left part              right part
         * +---------------------------------------------------------+
         * |  pivot  |    element <= pivot    |    element > pivot   |
         * +---------------------------------------------------------+
         *
         *
         *  result After Partitioning:
         *
         *         left part          a[lo]          right part
         * +---------------------------------------------------------+
         * |   element <= pivot    |  pivot  |    element > pivot    |
         * +---------------------------------------------------------+
         *
         *
         *  result : pivot = lo
         *
         *
         *  Recursion:
         *
         * l_pivot_sort(a, lo, pivot - 1)     l_pivot_sort(a, pivot + 1, hi)
         *
         *         left part                           right part
         * +-----------------------+             +-----------------------+
         * |   element <= pivot    |    pivot    |    element > pivot    |
         * +-----------------------+             +-----------------------+
         * lo                pivot - 1        pivot + 1                 hi
         *
         */
        int pivot = partition(a, lo, hi);
        l_pivot_sort(a, lo, pivot - 1);
        l_pivot_sort(a, pivot + 1, hi);
    }

    /**
     * pivot을 기준으로 파티션을 나누기 위한 약한 정렬 메소드
     *
     * @param a		정렬 할 배열
     * @param left	현재 배열의 가장 왼쪽 부분
     * @param right	현재 배열의 가장 오른쪽 부분
     * @return		최종적으로 위치한 피벗의 위치(lo)를 반환
     */
    private static int partition(int[] a, int left, int right) {

        int lo = left;
        int hi = right;
        int pivot = a[left];		// 부분리스트의 왼쪽 요소를 피벗으로 설정

        // lo가 hi보다 작을 때 까지만 반복한다.
        while(lo < hi) {

            /*
             * hi가 lo보다 크면서, hi의 요소가 pivot보다 작거나 같은 원소를
             * 찾을 떄 까지 hi를 감소시킨다.
             */
            while(a[hi] > pivot && lo < hi) {
                hi--;
            }

            /*
             * hi가 lo보다 크면서, lo의 요소가 pivot보다 큰 원소를
             * 찾을 떄 까지 lo를 증가시킨다.
             */
            while(a[lo] <= pivot && lo < hi) {
                lo++;
            }

            // 교환 될 두 요소를 찾았으면 두 요소를 바꾼다.
            swap(a, lo, hi);
        }


        /*
         *  마지막으로 맨 처음 pivot으로 설정했던 위치(a[left])의 원소와
         *  lo가 가리키는 원소를 바꾼다.
         */
        swap(a, left, lo);

        // 두 요소가 교환되었다면 피벗이었던 요소는 lo에 위치하므로 lo를 반환한다.
        return lo;
    }

    private static void treeSort(int[] arr) {
        Tree tree = new Tree(arr[0]);
        for (int i : arr) {
            tree.insert(tree.node,i);
        }
//        tree.inOrder(tree.node);
    }
}

class Node {
    int value;
    Node left;
    Node right;
    Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}

class Tree {

    Node node;

    Tree(int value) {
        node = new Node(value);
    }

    public Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        // Move to the left if passed value is
        // less than the current node
        if (value < node.value) {
            node.left = insert(node.left, value);
        }
        // Move to the right if passed value is
        // greater than the current node
        else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    // For traversing in order
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.value + " ");
            inOrder(node.right);
        }
    }

    public void inOrderDesc(Node node) {
        if (node != null) {
            inOrderDesc(node.right);
            System.out.print(node.value + " ");
            inOrderDesc(node.left);
        }
    }
}