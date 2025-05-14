package inflearn.kimtaewon1.b_array.l_mentoring;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://cote.inflearn.com/contest/10/problem/02-12
 */
public class Main {

    private static int makePair(
        // 4, 3
        int student, int test,
        int[][] arr
    ) {
        int answer = 0;
        // i * j = 총 경우의 수
        for (int mentor = 1; mentor <= student; mentor++) {
            for (int mentee = 1; mentee <= student; mentee++) {
                int pairCount = 0;
                // 테스트 횟수
                for (int t = 0; t < test; t++) {
                    int mentorRank = 0;
                    int menteeRank = 0;
                    // 등수 비교
                    for (int rank = 0; rank < student; rank++) {
                        if (arr[t][rank] == mentor) mentorRank = rank;
                        if (arr[t][rank] == mentee) menteeRank = rank;
                    }
                    if (mentorRank < menteeRank)
                        pairCount++;
                }
                if (pairCount == test) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int students = sc.nextInt();
        int testCount = sc.nextInt();
        int[][] testReport = new int[testCount][students];
        for (int i = 0; i < testCount; i++) {
            for (int j = 0; j < students; j++) {
                testReport[i][j] = sc.nextInt();
            }
        }
        System.out.println(makePair(students, testCount, testReport));
    }
}
