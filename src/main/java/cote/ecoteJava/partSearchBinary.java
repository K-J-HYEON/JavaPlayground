package cote.ecoteJava;

import java.util.Arrays;
import java.util.Scanner;

public class partSearchBinary {

    // 이진 탐색 소스코드 구현
    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            // 찾은 경우 중간점 인덱스
            if (arr[mid] == target) return mid;
            // 중간점의 값보다 찾고자 하는 값 작은 경우 왼쪽 확인
            else if (arr[mid] > target) end = mid - 1;
            // 중간점의 값보다 찾고자 하는 값 큰 경우 오른쪽 확인
            else start = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 가게 부품 개수
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        // 손님이 요청한 부품 개수
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님이 확인 요처한 부품 번호 하나씩 확인
        for (int i = 0; i < m; i++) {
            int result = binarySearch(arr, targets[i], 0, n - 1);
            if (result != -1) {
                System.out.print("yes ");
            }
            else {
                System.out.print("no ");
            }
        }

    }



}
