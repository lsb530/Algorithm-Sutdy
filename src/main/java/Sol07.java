import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Sol07 {
    public static void main(String[] args) {
        System.out.println(solution("ULURRDLLU")); // 7
        System.out.println(solution("LULLLLLLU")); // 7
    }

    // 좌표 평면을 벗어나는지 체크하는 메서드
    public static boolean isValidMove(int nx, int ny) {
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

    // 다음 좌표 결정을 위한 해시맵
    public static final HashMap<Character, int[]> location = new HashMap<>();

    public static void initLocation() {
        location.put('U', new int[]{0, 1});
        location.put('D', new int[]{0, -1});
        location.put('L', new int[]{-1, 0});
        location.put('R', new int[]{1, 0});
    }

    public static int solution(String dirs) {
        initLocation();
        int x = 5, y = 5; // 원점 이동 (5,5)
        ArrayList<String> al = new ArrayList<>(); // 이거로 하면 9번 움직였다고 해서 안됨
        HashSet<String> answer = new HashSet<>(); // 겹치는 좌표는 1개로 처리하기 위함
        HashSet<String> moveLog = new LinkedHashSet<>(); // 명령, 움직인 좌표 저장용

        // 명령대로 움직이면서 좌표저장
        for (int i = 0; i < dirs.length(); i++) {
            int[] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if (!isValidMove(nx, ny)) {
                continue;
            }
            else {
                // A -> B, B -> A
                al.add(String.format("[%s]: (%d,%d)->(%d,%d)", dirs.charAt(i), x, y, nx, ny));
                answer.add(String.format("(%d,%d)->(%d,%d)", x, y, nx, ny));
                answer.add(String.format("(%d,%d)->(%d,%d)", nx, ny, x, y));
                moveLog.add(String.format("[%s]: (%d,%d)->(%d,%d)", dirs.charAt(i), x, y, nx, ny));
                x = nx;
                y = ny;
            }
        }
        // for (String log : al) {
        //     System.out.println(log);
        // }
        // for (String log : moveLog) {
        //     System.out.println(log);
        // }

        return answer.size() / 2;
    }
}
