package boj.bronze.bronzeV;

import java.text.SimpleDateFormat;
import java.util.Date;

public class p10699 {

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY-MM-dd");
        Date today = new Date();
        String formatted = dateFormat.format(today);
        System.out.println(formatted);
    }
}