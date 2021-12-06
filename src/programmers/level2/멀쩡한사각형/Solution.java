package programmers.level2.멀쩡한사각형;

public class Solution {

    public static long solution(int w, int h) {
        int val = gcd(w, h);
        return ((long) w * h) - (w + h - val);
    }

    public static int gcd(int a, int b) {
        int temp, n;
        //a에 큰 값을 위치시키기 위한 조건문입니다.
        if(a<b){
            temp = a;
            a = b;
            b = temp;
        }
        //유클리드 알고리즘 부분입니다.
        //b가 0이 될때까지(a%b), 반복문을 돌게되고, b가 0인 순간의 a를 GCD로 판단하고 리턴합니다.
        while(b!=0){
            n = a%b;
            a = b;
            b = n;
        }
        return a;
    }

    public static void main(String[] args) {
        int w = 12, h = 8;
        solution(w, h);
    }
}