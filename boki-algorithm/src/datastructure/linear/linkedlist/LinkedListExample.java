package datastructure.linear.linkedlist;

public class LinkedListExample {

    public static void main(String[] args) {
        /* 선형 자료구조 - 연결 리스트
        각 노드가 데이터와 포인터를 가지고 일렬로 연결되어 있는 방식
        - 데이터의 접근이 느리다 - 링크를 타고 가서 찾아야함
        - 데이터 삽입, 삭제가 용이함
        - 포인터를 위한 추가 공간이 필요
        - 시간복잡도
        조회: O(n)
        맨 앞이나 뒤에 삽입/삭제하기: O(1), SinglyLinkedList의 경우 맨 뒤에 데이터 삭제 연산은 O(n)
        중간에 원하는 위치에 데이터 삽입/삭제하기: O(n) (원하는 원소까지 데이터를 조회하는 과정이 있으므로 O(n)+O(1)
         */
        System.out.println("==================Singly Linked List==================");
        ILinkedList<Integer> sll = new SinglyLinkedList<>();
        sll.addFirst(3);
        sll.addLast(10);
        sll.addFirst(2);
        sll.addLast(12);
        System.out.println(sll);
        System.out.println("size : " + sll.size());
        System.out.println("first : " + sll.first());
        System.out.println("last : " + sll.last());
        System.out.println("removeFirst : " + sll.removeFirst());
        System.out.println(sll);
        System.out.println("removeLast : " + sll.removeLast());
        System.out.println(sll);
        System.out.println("removeFirst : " + sll.removeFirst());
        System.out.println(sll);
        System.out.println("removeLast : " + sll.removeLast());
        System.out.println(sll);
        System.out.println("size : " + sll.size());

        System.out.println("==================Doubly Linked List==================");
        ILinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.addFirst(3);
        dll.addLast(10);
        dll.addFirst(2);
        dll.addLast(12);
        System.out.println(dll);
        System.out.println("size : " + dll.size());
        System.out.println("first : " + dll.first());
        System.out.println("last : " + dll.last());
        System.out.println("removeFirst : " + dll.removeFirst());
        System.out.println(dll);
        System.out.println("removeLast : " + dll.removeLast());
        System.out.println(dll);
        System.out.println("removeFirst : " + dll.removeFirst());
        System.out.println(dll);
        System.out.println("removeLast : " + dll.removeLast());
        System.out.println(dll);
        System.out.println("size : " + dll.size());
    }
}