package boj.bronze.bronzeV;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class p16170 {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY\nMM\ndd");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date now = new Date();
        String s = dateFormat.format(now);
        System.out.println(s);
    }
}