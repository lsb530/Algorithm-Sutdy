package boj.steps.a22우선순위큐.최소힙;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            if(val == 0) {
                if(minHeap.isEmpty()) bw.write(0 + "\n");
                else bw.write(minHeap.poll() + "\n");
            }
            else minHeap.offer(val);
        }
        bw.flush();
        bw.close();
    }

}