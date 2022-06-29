package cote.ecoteJava;

import java.util.Scanner;

public class riceBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 떡 개수, 떡 길이
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 떡 개별 높이
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색 시작점 / 끝점 설정
        int start = 0;
        int end = (int) 1e9;

        int result = 0;
        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < n; i++) {
                // 잘랐을 때 떡 양 계산
                if (arr[i] > mid) total += arr[i] - mid;
            }
            if (total < m) { // 떡의 양 부족한 경우 많이 자르기
                end = mid - 1;
            }
            else { // 떡 양 충분한 경우 덜 자르기
                result = mid; // 최대한 덜 잘랐을 때 정답 => result 기록
                start = mid + 1;
            }
        }
        System.out.println(result);

    }
}
