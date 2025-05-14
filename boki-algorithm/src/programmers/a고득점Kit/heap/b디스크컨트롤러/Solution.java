package programmers.a고득점Kit.heap.b디스크컨트롤러;

import java.util.PriorityQueue;

public class Solution {

    static class Job implements Comparable<Job> {

        int start, finish;

        public Job(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        @Override
        public int compareTo(Job o) {
            return this.finish - o.finish;
        }
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        int sol = solution(jobs);
        System.out.println("sol = " + sol);
    }

    public static int solution(int[][] jobs) {
        PriorityQueue<Job> pq = new PriorityQueue<>();
        for (int[] job : jobs) {
            pq.add(new Job(job[0], job[1]));
        }
        int ms = 0;
        int jobFin = pq.poll().finish;
        ms += jobFin;
//        {2, 6} , {1, 9}
        while (!pq.isEmpty()) {
            Job job = pq.poll();
            int time = Math.abs(jobFin - job.start) + job.finish;
            ms += time;
            jobFin += job.finish;
        }
        ms = ms / jobs.length;
        return ms;
    }
}