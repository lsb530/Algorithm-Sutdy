package datastructure.linear.array;

public class Main {

    public static void main(String[] args) {
        /* 선형 자료구조 - 배열
        동일한 자료형의 데이터를 일렬로 나열한 자료구조
        - 인덱스로 접근 가능: Random Access
        - 데이터 삽입, 삭제가 어려움: Shift 해줘야함
        - 시간복잡도
        조회: O(1)
        삽입/삭제: O(n)
         */
        // 선언
        int[] arrayOfInt;
        String[] arrayOfString;

        // 생성
        arrayOfInt = new int[100];
        arrayOfString = new String[10];

        // 초기화
        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = i;
        }
        arrayOfString = new String[]{"hello", "world"};
        String[] name = {"Stacy", "Tracy", "Dorothy"};
    }
}