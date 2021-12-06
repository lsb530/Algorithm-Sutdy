package programmers.level2.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;

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

    public static String[] solution(String[] record) {
        ArrayList<Operation> operationArrayList = new ArrayList<>();
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
//                nameMap.remove(uid);
                operationArrayList.add(new Operation(op, uid));
            } else {
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

    public static void main(String[] args) {
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234",
            "Enter uid1234 Prodo", "Change uid4567 Ryan"};
        solution(record);
    }
}