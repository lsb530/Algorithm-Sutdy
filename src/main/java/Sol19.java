import java.util.HashMap;

public class Sol19 {
    public static void main(String[] args) {
        String answer1 = solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}); // leo
        String answer2 = solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}); // vinko
        String answer3 = solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}); // mislav

        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
    }

    public static String solution(String[] participant, String[] completion) {
        // 해시맵 생성
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 완주한 선수들의 이름을 해시맵에 저장
        for (String c : completion) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (String p : participant) {
            // 완주하지 못한 선수를 찾으면 반환
            if (hashMap.getOrDefault(p, 0) == 0) {
                return p;
            }
            else {
                // 참가한 선수들의 이름을 키로 하는 값을 1씩 감소
                hashMap.put(p, hashMap.get(p) - 1);
            }
        }

        return null;
    }
}
