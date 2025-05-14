import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class Sol04 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        // System.out.println(Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    public static int[] solution(int[] answers) {
        int[][] pattern = {
                {1, 2, 3, 4, 5}, // j = 0
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] scores = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < pattern.length; j++) {
                // System.out.print(pattern[j][i % pattern[j].length] + " ");
                if (answers[i] == pattern[j][i % pattern[j].length]) {
                    scores[j]++;
                }
            }
            // System.out.println();
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                answer.add(i + 1);
            }
        }

        // System.out.println(scores[0]);
        // System.out.println(scores[1]);
        // System.out.println(scores[2]);

        System.out.println(answer);

        // System.out.println(Arrays.toString(scores));

        // return new int[]{};
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
