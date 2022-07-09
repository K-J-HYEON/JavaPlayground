package cote.ecoteJava;

import java.util.Scanner;

public class oneGreedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // n k를 공백 기준으로 구분하여 입력
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = 0;

        while(true) {
            // n이 k로 나누어 떨어지는 수가 될 때까지 1씩 빼기
            int target = (n / k) * k;
            result += (n - target);
            n = target;
            // n이 k보다 작을 때 반복문 탈출
            if (n < k) break;
            result += 1;
            n /= k;
        }

        result += (n - 1);
        System.out.println(result);
    }
}
