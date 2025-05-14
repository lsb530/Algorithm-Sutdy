package boj.steps.a22우선순위큐.최대힙;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            int val = Integer.parseInt(br.readLine());
            if(val == 0) {
                if(maxHeap.isEmpty()) bw.write(0 + "\n");
                else bw.write(maxHeap.poll() + "\n");
            }
            else maxHeap.offer(val);
        }
        bw.flush();
        bw.close();
    }

}