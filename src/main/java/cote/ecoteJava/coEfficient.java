package cote.ecoteJava;

import java.util.HashSet;
import java.util.Scanner;

public class coEfficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N
        int n = sc.nextInt();

        // HashSet 라이브러리
        HashSet<Integer> s = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }

        // M
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품 번호 확인
        for (int i = 0; i < m; i++) {
            if (s.contains(targets[i])) {
                System.out.print("yes");
            }
            else {
                System.out.print("no");
            }
        }
    }
}
