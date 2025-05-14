package engineer.linked;

public class LinkedList {

    Node header;

    static class Node {
        int data;
        Node next = null;
    }

    public LinkedList() {
        header = new Node();
    }

    void append(int d) {
        Node end = new Node();
        end.data = d;
        Node n = header;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int d) {
        Node n = header;
        while (n.next != null) {
            if (n.next.data == d) { // 다음 데이터가 도달하기 전에 판단함
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;
        while (n.next != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    void removeDups() {
        Node n = header;
        while (n.next != null) {
            Node r = n;
            System.out.println("n.data = " + n.data);
            System.out.println("n.next = " + n.next);
            System.out.println("n.next.data = " + n.next.data);
            while (r.next != null) {
                if (n.data == r.next.data) {
                    r.next = r.next.next;
                } else {
                    r = r.next;
                }
            }
            n = n.next;
        }
    }
}

class Test {

    public static void main(String[] args) {
//        Node head = new Node(1);
//        head.append(2);
//        head.append(3);
//        head.append(4);
//        head.retrieve();
//        head.delete(2);
//        head.delete(3);
//        head.retrieve();

//        LinkedList ll = new LinkedList();
//        ll.append(1);
//        ll.append(2);
//        ll.append(3);
//        ll.append(4);
//        ll.retrieve();
//        ll.delete(1);
//        ll.retrieve();

        LinkedList ll = new LinkedList();
        ll.append(2);
        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.append(4);
        ll.append(2);
        ll.retrieve();
        ll.removeDups();
        ll.retrieve();
    }
}