package cote.ecoteJava;

import java.util.Scanner;

public class numberCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        // 한 줄씩 입력 받아 확인
        for (int i = 0; i < n; i++) {
            // 현재 줄에서 가장 작은 수 찾기
            int min_value = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                min_value = Math.min(min_value, x);
            }
            // 가장 작은 수들 중 가장 큰 수 찾기
            result = Math.max(result, min_value);
        }

        System.out.println(result);
    }
}
