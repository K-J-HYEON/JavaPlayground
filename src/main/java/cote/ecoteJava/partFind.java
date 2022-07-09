package cote.ecoteJava;

import java.util.Arrays;
import java.util.Scanner;

public class partFind {
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) return mid;

            // 중간점 ~
            else if (arr[mid] > target) end = mid - 1;

            //
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색 수행 위해 사전에 정렬 수행
        Arrays.sort(arr);

        // m 손님이 확인 요청한 부품 개수
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품 번호 하나씩 확인
        for (int i = 0; i < m; i++) {
            // 해당 부품 존재?
            int result = binarySearch(arr, targets[i], 0, n - 1);
            if (result != -1) {
                System.out.println("yes ");
            }
            else {
                System.out.println("no ");
            }
        }
    }
}
