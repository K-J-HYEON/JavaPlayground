package cote.ecoteJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class upDownSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N을 입력받기
        int n = sc.nextInt();

        // N개의 정수 입력받아 리슽츠에 저장
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 기본 정렬 라이브러리 이용해 내림차순 정렬
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
