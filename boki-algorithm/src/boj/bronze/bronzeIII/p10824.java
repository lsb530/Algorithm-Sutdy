package boj.bronze.bronzeIII;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p10824 {

    public static void main(String[] args) throws IOException {
        // in: 10 20 30 40
        // output: 4060
        // 1020 + 3040 = 4060
        // 10_000_001_000_000 => BigInteger
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] numbers = br.readLine().split(" ");
        BigInteger a = BigInteger.valueOf(Long.parseLong(numbers[0] + numbers[1]));
        BigInteger b = BigInteger.valueOf(Long.parseLong(numbers[2] + numbers[3]));
        System.out.println(a.add(b));
    }

}