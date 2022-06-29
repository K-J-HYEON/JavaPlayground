package cote.ecoteJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class upDownSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 입력
        int n = sc.nextInt();

        // N개 정수 입력받아 리스트에 저장
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 기본 정렬 라이브러리 => 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
