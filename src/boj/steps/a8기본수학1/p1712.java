package boj.steps.a8기본수학1;

import static java.lang.System.in;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1712 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        /*
        월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며,
        한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
        예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.
        노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다
        많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK - EVEN POINT)이라고 한다.
        A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
         */
        // 손익분기점 : A + B * n = nC
        // A / n + B = C
        // A / n = C - B
        // 1 / n = C - B / A
        // n = A / C - B = 손익분기점
        // if (n>0) n+1
        // else if(n<=0) -1
        // 0이 된다는 것은 C = B
        // -가 된다는 것은 C < B
        // 결론 C <= B
        // 3 2 1
        String[] data = br.readLine().split(" ");
        int a = Integer.parseInt(data[0]);
        int b = Integer.parseInt(data[1]);
        int c = Integer.parseInt(data[2]);
        int result = (c <= b) ? -1 : (a / (c - b)) + 1;
        System.out.println(result);
    }

}