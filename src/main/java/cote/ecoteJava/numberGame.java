package cote.ecoteJava;

import java.util.Scanner;

public class numberGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // 가장 작은 수들 중에서 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result);

    }
}
