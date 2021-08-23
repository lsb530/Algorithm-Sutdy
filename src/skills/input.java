package skills;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class input {
//6
//4 2 6 3 1 5
    public static void main(String[] args) throws IOException {
        ScannerInput();
        BufferReaderAndTokenizer();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp2[] = br.readLine().split(" ");
        
    }

    private static void BufferReaderAndTokenizer() throws IOException {
        final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(methodName + " 메소드 실행 시간 측정");
        long start = System.currentTimeMillis();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int end = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[end];
        for (int i = 0; i < end; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long finish = System.currentTimeMillis();
        System.out.println("실행시간 : " + (finish - start)/1000.0);
    }

    private static void ScannerInput() {
        final String methodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        System.out.println(methodName + " 메소드 실행 시간 측정");
        long start = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int[] arr = new int[end];
        for (int i = 0; i < end; i++) {
            arr[i] = sc.nextInt();
        }
        long finish = System.currentTimeMillis();
        System.out.println("실행시간 : " + (finish - start)/1000.0);
    }


}