import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class HashMapTest {
    @Test
    void test() {
        // HashMap<KeyType, ValueType>
        HashMap<String, Integer> hashMap = new HashMap<>();

        // 데이터 추가
        hashMap.put("ABC", 10);
        hashMap.put("BBB", 20);
        hashMap.put("AAA", 30);
        hashMap.put("ABC", 15);

        System.out.println(hashMap.isEmpty()); // false
        System.out.println(hashMap.get("ABC")); // 15
        System.out.println(hashMap.containsKey("ABC")); // true

        hashMap.remove("ABC"); // 해시맵에서 키가 ABC인 데이터 제거
        System.out.println(hashMap.size()); // 2

        hashMap.clear(); // 해시맵의 모든 데이터 삭제
        System.out.println(hashMap.isEmpty()); // true
    }
}
