// Top Down

package cote.doit;

import java.util.Scanner;

public class Fibonacci {
    static int[] D;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        D = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            D[i] = -1;
        }

        D[0] = 0;
        D[1] = 1;
        fibo(n);
        System.out.println(D[n]);
    }

    static int fibo(int n) {
        if (D[n] != -1) // 기에 계산한 적이 있는 부분의 문제는 재계산하지 않고 리턴
            return D[n];
        return D[n] = fibo(n - 2) + fibo(n - 1);
        // 메모이제이션: 구한 값을 바로 리턴하지 않고 DP 테이블에 저장한 후에 리턴하도록 로직 구현

    }
}