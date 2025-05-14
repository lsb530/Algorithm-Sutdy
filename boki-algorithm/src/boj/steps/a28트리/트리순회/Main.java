package boj.steps.a28트리.트리순회;

import java.util.Scanner;

class Node {

    char data;
    Node left;
    Node right;

    public Node() {
    }

    public Node(char data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class Main {

    private static void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    private static void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data);
            inOrder(node.right);
        }
    }

    private static void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data);
        }
    }

    public static void main(String[] args) {
        Node[] tree = new Node[26];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 26; i++) {
            tree[i] = new Node();
        }
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char root = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);
            tree[root - 'A'].data = root;
            if (left != '.') {
                tree[left - 'A'] = new Node(left, null, null);
                tree[root - 'A'].left = tree[left - 'A'];
            }
            if (right != '.') {
                tree[right - 'A'] = new Node(right, null, null);
                tree[root - 'A'].right = tree[right - 'A'];
            }
        }
        preOrder(tree[0]);
        System.out.println();
        inOrder(tree[0]);
        System.out.println();
        postOrder(tree[0]);
    }
}