package skills;

import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.empty());
        st.push(1);
        st.push(2);
        st.push(3);
        int size = st.size();
        System.out.println("size = " + size);
        Integer last = st.pop();
        System.out.println("last = " + last);
        System.out.println("size = " + st.size());
        System.out.println(st.isEmpty());
    }
}