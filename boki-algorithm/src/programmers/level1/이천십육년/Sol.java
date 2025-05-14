package programmers.level1.이천십육년;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Sol {
    public String solution(int a, int b) {
        LocalDate ldt = LocalDate.of(2016, a, b);
        String displayName = ldt.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
        return displayName.toUpperCase();
    }

    public static void main(String[] args) {
        Sol s = new Sol();
        System.out.println(s.solution(5, 24));
    }
}
