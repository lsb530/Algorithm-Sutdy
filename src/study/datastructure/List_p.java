package study.datastructure;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class List_p {

    public static void main(String[] args) {
        int[] a = new int[10];
        ArrayList<Integer> b = new ArrayList<>();
        Vector<Integer> c = new Vector<>();
        Vector<Integer> z = new Stack<>();
        Stack<Integer> d = new Stack<>();
        Queue<Integer> e = new ArrayDeque<>();
        Queue<Integer> f = new LinkedList<>();
        Queue<Integer> g = new PriorityQueue<>();
        Deque<Integer> h = new ArrayDeque<>();
        Deque<Integer> i = new LinkedList<>();
        System.out.println("ArrayDeque Queue");
        e.offer(10);
        e.offer(5);
        e.offer(13);
        while(!e.isEmpty()) {
            System.out.println(e.poll());
        }
        System.out.println("LinkedList Queue");
        f.offer(1);
        f.offer(4);
        f.offer(3);
        while(!f.isEmpty()) {
            System.out.println(f.poll());
        }
        System.out.println("Priority Queue");
        g.offer(10);
        g.offer(5);
        g.offer(13);
        while(!g.isEmpty()) {
            System.out.println(g.poll());
        }
        System.out.println("");
        h.addLast(15);
        h.addLast(3);
        h.addLast(8);
        h.addFirst(7);
        h.addFirst(9);
        h.addFirst(1);

    }
}