import java.util.Arrays;

public class Sol25 {

    public static void main(String[] args) {
        // [“1 2 4 5 3 6 7”, “4 2 5 1 6 3 7”, “4 5 2 6 7 3 1”]
        String[] answer = solution(new int[]{1, 2, 3, 4, 5, 6, 7});
        System.out.println(Arrays.toString(answer));
    }

    public static String[] solution(int[] nodes) {
        String[] result = new String[3];
        result[0] = preorder(nodes, 0).trim(); // 마지막 공백 제거
        result[1] = inorder(nodes, 0).trim(); // 마지막 공백 제거
        result[2] = postorder(nodes, 0).trim(); // 마지막 공백 제거
        return result;
    }

    public static String preorder(int[] nodes, int idx) {
        if (idx >= nodes.length) { // idx가 범위를 벗어나면 빈 문자열 반환
            return "";
        }

        // root -> left -> right recursive call
        return nodes[idx] + " " +
                preorder(nodes, 2 * idx + 1) +
                preorder(nodes, 2 * idx + 2);
    }

    public static String inorder(int[] nodes, int idx) {
        if (idx >= nodes.length) { // idx가 범위를 벗어나면 빈 문자열 반환
            return "";
        }

        // left -> root -> right recursive call
        return inorder(nodes, 2 * idx + 1) +
                nodes[idx] + " " +
                inorder(nodes, 2 * idx + 2);
    }

    public static String postorder(int[] nodes, int idx) {
        if (idx >= nodes.length) { // idx가 범위를 벗어나면 빈 문자열 반환
            return "";
        }

        // left -> right -> root recursive call
        return postorder(nodes, 2 * idx + 1) +
                postorder(nodes, 2 * idx + 2) +
                nodes[idx] + " ";

    }
}
