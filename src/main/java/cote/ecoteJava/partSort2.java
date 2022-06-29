package cote.ecoteJava;

import java.util.Scanner;

public class partSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n개 부품 개수
        int n = sc.nextInt();
        int[] arr = new int[1000001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            arr[x] = 1;
        }

        // m 손님이 확인 요청한 부품 개수
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품 번호 하나씩 확인
        for (int i = 0; i < m; i++) {
            // 해당 부품이 존재하는지 확인
            if (arr[targets[i]] == 1) {
                System.out.println("yes ");
            }
            else {
                System.out.println("no ");
            }
        }


    }
}
