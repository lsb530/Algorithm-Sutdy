package programmers.level2.오픈채팅방;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

class Operation {

    private String op;
    private String uid;

    public Operation(String op, String uid) {
        this.op = op;
        this.uid = uid;
    }

    public String getOp() {
        return op;
    }

    public String getUid() {
        return uid;
    }

}

public class Solution {

    @Test
    public void test() {
        assertArrayEquals(solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
                "Enter uid1234 Prodo", "Change uid4567 Ryan"}),
            new String[]{"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."});
    }

    public static String[] solution(String[] record) {
        // 순서를 보장하기 위한 오퍼레이션과 uid를 담은 리스트
        ArrayList<Operation> operationArrayList = new ArrayList<>();
        // 사실 오퍼레이션에 이름까지 담으면 되는데 왜 이렇게했나싶기도 하지만.. 아이디와 이름이 들어간 해시맵
        HashMap<String, String> nameMap = new HashMap<>();
        for (int i = 0; i < record.length; i++) {
            String[] ops = record[i].split(" ");
            String op = ops[0];
            if (op.equals("Enter")) {
                String uid = ops[1];
                String name = ops[2];
                nameMap.put(uid, name);
                operationArrayList.add(new Operation(op, uid));
            }
            else if (op.equals("Leave")) {
                String uid = ops[1];
                // 이렇게 안해주면 나중에 null님이 입장했습니다. null님이 퇴장했습니다 이렇게 됨
//                nameMap.remove(uid);
                operationArrayList.add(new Operation(op, uid));
            } else {
                // change일 경우
                String uid = ops[1];
                String name = ops[2];
                if (nameMap.containsKey(uid)) {
                    nameMap.put(uid, name);
                }
            }
        }
        String[] answer = new String[operationArrayList.size()];
        int idx = 0;
        for (Operation operation : operationArrayList) {
            // 리스트에는 Enter or Leave만 들어있음
            if (operation.getOp().equals("Enter")) {
                answer[idx] = nameMap.get(operation.getUid()) + "님이 들어왔습니다.";
            } else {
                answer[idx] = nameMap.get(operation.getUid()) + "님이 나갔습니다.";
            }
            idx++;
        }
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println(answer[i]);
//        }
        return answer;
    }
}