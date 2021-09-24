package boj.silver.silverI;

import java.util.Scanner;

class Node {

    char left;
    char right;
}

public class p1991_트리순회_다른방법 {

    static Node[] tree = new Node[100];

    private static void preOrder(char root) {
        if (root != '.') {
            System.out.print(root);
            preOrder(tree[root].left);
            preOrder(tree[root].right);
        }
    }

    private static void inOrder(char root) {
        if (root != '.') {
            inOrder(tree[root].left);
            System.out.print(root);
            inOrder(tree[root].right);
        }
    }

    private static void postOrder(char root) {
        if (root != '.') {
            postOrder(tree[root].left);
            postOrder(tree[root].right);
            System.out.print(root);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char root = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);
            tree[root] = new Node();
            tree[root].left = left;
            tree[root].right = right;
        }
        preOrder('A');
        System.out.println();
        inOrder('A');
        System.out.println();
        postOrder('A');
    }
}