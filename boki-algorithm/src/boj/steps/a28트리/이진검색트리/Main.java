package boj.steps.a28트리.이진검색트리;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        void insert(int data) {
            if(data < this.data) {
                if(this.left == null) this.left = new Node(data);
                else this.left.insert(data);
            } else {
                if(this.right == null) this.right = new Node(data);
                else this.right.insert(data);
            }
        }
    }

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        Node root = new Node(Integer.parseInt(br.readLine()));
        String input;
        while(true) {
            input = br.readLine();
            if(input == null || input.equals("")) break;
            root.insert(Integer.parseInt(input));
        }
        postOrder(root);
        bw.flush();
        bw.close();
        br.close();
    }

    static void postOrder(Node node) throws IOException{
        if(node == null) return;
        postOrder(node.left);
        postOrder(node.right);
        bw.write(node.data + "\n");
    }
}