package skills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class graphInput {

    public static void main(String[] args) throws IOException {
//5 6
//1
//5 1 1
//1 2 2
//1 3 3
//2 3 4
//2 4 5
//3 4 6
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[][] array = new int[100][100];
        for (int i = 1; i <= n; i++) {
            String temp2[] = br.readLine().split(" ");
            int sum = 0;
            for (int j = 1; j <= n; j++) {
                array[i][j] = Integer.parseInt(temp2[j - 1]); // 읽어들인 값을 실제 사용할 배열에 저장
            }
        }
    }
}