package boj.steps.a20분할정복.행렬곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int[][] arrA;
    static int[][] arrB;
    static int N1, N2, M1, M2;
    static int[][] result;
    
//    int[][] A = new int[N][M];	// N x M 크기의 행렬
//    int[][] B = new int[M][K];	// M x K 크기의 행렬
//    int[][] C = new int[N][K];	// AxB의 행렬을 담을 N x K 크기의 행렬
//
//      for (int k = 0; k < M; k++) {
//        for (int i = 0; i < N; i++) {
//
//            // A(ik) 원소를 고정시켜두고, 그에 대한 B의 k열을 고정시켜 j행을 움직이면서 연산한다.
//            r = A[i][k];
//            for (int j = 0; j < K; j++) {
//                res[i][j] += r * B[k][j];
//            }
//        }
//    }
    public static void main(String[] args) throws IOException {
        inputData();
        result = new int[N1][M2];
        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < M2; j++) {
                for (int k = 0; k < M1; k++) {    // 더해주는 원소의 개수는 총 M1개다.
                    result[i][j] += arrA[i][k] * arrB[k][j];
                }
            }
        }
        for (int i = 0; i < N1; i++) {
            for (int j = 0; j < M2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void inputData() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N1 = Integer.parseInt(st.nextToken());
        M1 = Integer.parseInt(st.nextToken());
        arrA = new int[N1][M1];
        for (int i = 0; i < N1; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M1; j++) {
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        N2 = Integer.parseInt(st.nextToken());
        M2 = Integer.parseInt(st.nextToken());
        arrB = new int[N2][M2];
        for (int i = 0; i < N2; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M2; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }
}