package cote.ecoteJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class eleSwapSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n k 입력받기
        int n = sc.nextInt();
        int k = sc.nextInt();

        // 배열 a의 모든 원소 입력
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 배열 b의 모든 원소 입력
        Integer[] b = new Integer[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        // 배열 a는 오름차순 정렬
        Arrays.sort(a);

        // 배열 b는 내림차순 정렬
        Arrays.sort(b, Collections.reverseOrder());

        // 첫 번째 인덱스부터 확인, 두 배열 원소 최대 k번 비교
        for (int i = 0; i < k; i++) {
            if (a[i] < b[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
            else break;
        }

        // 배열 a의 모든 원소 합 출력
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += a[i];
        }
        System.out.println(result);

        // a의 원소가 b의 원소보다 크거나 같을 때, 반복문을 탈출

        // 배열 a의 모든 원소의 합을 출력

    }
}
