package inflearn.kimtaewon1.e_stackandqueue.h_emergency;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 * https://cote.inflearn.com/contest/10/problem/05-08
 */
public class Main {

    static class Patient {

        int idx;
        int score;

        public Patient(int idx, int score) {
            this.idx = idx;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Patient{" + "idx=" + idx + ", score=" + score + '}';
        }
    }

    private static int solution(int patients, int target, List<Patient> list) {
        Queue<Patient> patientQueue = new ArrayDeque<>(patients);
        int answer = 0;
        for (Patient patient : list) {
            patientQueue.offer(patient);
        }
        while (!patientQueue.isEmpty()) {
            Patient patient = patientQueue.poll();
            boolean isUrgent = true;
            for (Patient p : patientQueue) {
                if (p.score > patient.score) {
                    patientQueue.offer(patient);
                    isUrgent = false;
                    break;
                }
            }
            if (isUrgent) {
                answer++;
                if (patient.idx == target) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        List<Patient> patients = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            patients.add(new Patient(i, scanner.nextInt()));
        }
        System.out.println(solution(m, n, patients));
    }
}
