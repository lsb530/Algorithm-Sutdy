import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Juest {

    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("aaa");
//        arr.add("aaa");
        arr.add("bbb");
        arr.add("ccc");
        solution(arr);
    }

    public static void solution(List<String> sources) {
        List<String> result1 = new ArrayList<String>();
        List<String> result2 = new ArrayList<String>();

        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        Set<String> set = new HashSet<String>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        sources.forEach(
            str -> {
                if (list.contains(str)) {
                    result1.add(str);
                }
            }
        );
        sources.forEach(
            str -> {
                if (set.contains(str)) {
                    result2.add(str);
                }
            }
        );

        System.out.println(result1.size() == result2.size());
        int a = 1;
        while (a<=25) {
            a *= 3;
        }
        System.out.println(a);
    }
}