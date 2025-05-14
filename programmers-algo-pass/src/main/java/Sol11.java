import java.util.Stack;

public class Sol11 {
    public static void main(String[] args) {
        System.out.println(solution("baabaa")); // 1
        System.out.println(solution("cdcd")); // 0
    }

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            // 스택이 비어 있지 않고, 현재 문자와 스택의 맨 위 문자가 같으면
            if(!stack.isEmpty() && stack.peek() == c) stack.pop(); // 스택의 맨 위 문자 제거
            else stack.push(c); // 스택에 현재 문자 추가
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
