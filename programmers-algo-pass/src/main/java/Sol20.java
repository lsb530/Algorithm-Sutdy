import java.util.HashMap;

public class Sol20 {
    public static void main(String[] args) {
        int answer1 = solution(
                new String[]{"banana", "apple", "rice", "pork", "pot"},
                new int[]{3, 2, 2, 2, 1},
                new String[]{"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}
        ); // 3
        // "", "", "", "", "", "", "", "", "", "",
        // "banana" -> 3
        // "apple" -> 2
        // "rice" -> 2
        // "pork" -> 2
        // "pot" -> 1

        int answer2 = solution(
                new String[]{"apple"},
                new int[]{10},
                new String[]{"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"}
        ); // 0

        System.out.println(answer1);
        System.out.println(answer2);
    }

    public static int solution(String[] want, int[] number, String[] discount) {
        // want, number배열의 값을 해시맵에 저장
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        // 총 일수를 계산할 변수 초기화
        int answer = 0;

        // 특정일 i에 회원가입 시 할인받을 수 있는 품목 체크(특정일 기준으로 10일간 쇼핑해야 하기 때문)
        for (int i = 0; i < discount.length - 9; i++) {
            // i일 회원가입 시 할인받는 제품 및 개수를 담을 해시맵
            HashMap<String, Integer> discount10day = new HashMap<>();

            // i일 회원가입 시 할인받는 제품 및 개수로 해시맵 구성(10일간 순회)
            for (int j = i; j < i + 10; j++) {
                if (wantMap.containsKey(discount[j])) {
                    discount10day.put(discount[j], discount10day.getOrDefault(discount[j], 0) + 1);
                }
            }

            // 할인하는 상품의 개수가 원하는 수량과 일치하면 정답 변수에 1 추가
            if (discount10day.equals(wantMap))
                answer++;
        }

        return answer;
    }
}