import java.util.Stack;

public class Sol08 {
    public static void main(String[] args) {
        System.out.println(solution("()()")); // t
        System.out.println(solution("(())()")); // t
        System.out.println(solution(")()(")); // f
        System.out.println(solution("(()(")); // f
        System.out.println(solution("(")); // f
        System.out.println(solution("((")); // f
        System.out.println(solution(")")); // f
        System.out.println(solution("))")); // f
    }

    public static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(c);
            else {
                if (stack.isEmpty() || stack.pop() == c) return false;
            }
        }
        return stack.isEmpty();
    }
}
