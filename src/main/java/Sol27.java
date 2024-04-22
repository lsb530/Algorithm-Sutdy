import java.util.Arrays;
import java.util.HashMap;

public class Sol27 {
    public static void main(String[] args) {
        // [360, 958, 108, 0, 450, 18, 180, 1080]
        int[] answer1 = solution(
                new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
                new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
                new String[]{"young", "john", "tod", "emily", "mary"},
                new int[]{12, 4, 2, 5, 10}
        );
        System.out.println(Arrays.toString(answer1));

        // [0, 110, 378, 180, 270, 450, 0, 0]
        int[] answer2 = solution(
                new String[]{"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"},
                new String[]{"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"},
                new String[]{"sam", "emily", "jaimie", "edward"},
                new int[]{2, 3, 5, 4}
        );
        System.out.println(Arrays.toString(answer2));
    }

    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        // parent 해시맵, key: enroll의 노드, value: referral의 노드
        HashMap<String, String> parent = new HashMap<>();
        for (int i = 0; i < enroll.length; i++) {
            parent.put(enroll[i], referral[i]);
        }

        // total 해시맵 생성
        HashMap<String, Integer> total = new HashMap<>();

        // seller 배열과 amount 배열을 이용하여 이익 분배
        for (int i = 0; i < seller.length; i++) {
            String curName = seller[i];
            // 판매자가 판매한 총금액 계산
            int money = amount[i] * 100;
            // 판매자부터 차례대로 상위 노드로 이동하며 이익 분배
            while (money > 0 && !curName.equals("-")) {
                // 현재 판매자가 받을 금액 계산(10%를 제외한 금액)
                total.put(curName, total.getOrDefault(curName, 0) + money - (money / 10));
                curName = parent.get(curName);
                // 10%를 제외한 금액 계산
                money /= 10;
            }
        }

        // enroll 배열의 모든 노드에 해당하는 이익을 배열로 변환
        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = total.getOrDefault(enroll[i], 0);
        }
        return answer;
    }

}
