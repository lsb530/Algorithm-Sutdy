import java.util.ArrayDeque;
import java.util.HashMap;

public class Sol10 {
    public static void main(String[] args) {
        System.out.println(solution("[](){}")); // 3
        System.out.println(solution("}]()[{")); // 2
        System.out.println(solution("[)(]")); // 0
        System.out.println(solution("}}}")); // 0
    }

    public static int solution(String s) {
        // 괄호 정보 저장. 간결한 코드
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        // 원본 문자열의 길이 저장
        int n = s.length();
        s += s; // 원본 문자열 뒤에 원문 분자열을 이어 붙여서 2번 나오도록 만들어줌
        int answer = 0;

        // 확인할 문자열의 시작 인덱스를 0부터 n까지 이동
        A:for (int i = 0; i < n; i++) {
            ArrayDeque<Character> stack = new ArrayDeque<>();
            // i(시작 위치)부터 원본 문자열의 길이인 n개까지 올바른 괄호 문자열인지 확인
            for (int j = i; j < i + n; j++) {
                char c = s.charAt(j);
                // 해시맵 안에 해당 키가 없다면 열리는 괄호
                if (!map.containsKey(c)) {
                    stack.push(c);
                }
                else {
                    // 짝이 맞지 않으면 내부 for문은 종료하고 for문 A로 이동
                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {
                        continue A;
                    }
                }
            }
            if (stack.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }

}
