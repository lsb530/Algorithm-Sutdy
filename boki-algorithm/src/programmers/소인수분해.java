package programmers;

import java.util.ArrayList;
import java.util.List;

public class 소인수분해 {

    public static List<Integer> getFactorization(int N) {
        List<Integer> result = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(N); i++) {	// 또는 i * i <= N
            while(N % i == 0) {
                result.add(i);
                N /= i;
            }
        }

        if(N != 1) {
            result.add(N);
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> factorization = getFactorization(15);
        System.out.println("factorization = " + factorization);
    }
}
