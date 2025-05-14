import java.util.HashSet;
import java.util.Arrays;

public class Sol32 {

    public static void main(String[] args) {
        int[] answer1 = solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        System.out.println(Arrays.toString(answer1)); // [3, 3]

        int[] answer2 = solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"});
        System.out.println(Arrays.toString(answer2)); // [0, 0]

        int[] answer3 = solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"});
        System.out.println(Arrays.toString(answer3)); // [1, 3]
    }

    public static int[] solution(int n, String[] words) {
        // 이미 사용한 단어를 저장하는 set
        HashSet<String> usedWords = new HashSet<>();
        // 이전 단어의 마지막 글자
        char prevWord = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            // 이미 사용한 단어이거나 첫 글자가 이전 단어와 일치하지 않으면
            if (usedWords.contains(words[i]) || words[i].charAt(0) != prevWord) {
                // 탈락하는 사람의 번호와 차례를 반환
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            // 사용한 단어로 추가
            usedWords.add(words[i]);
            // 이전 단어의 마지막 글자 업데이트
            prevWord = words[i].charAt(words[i].length() - 1);
        }

        // 모두 통과했을 경우 반환값
        return new int[]{0, 0};
    }
}
