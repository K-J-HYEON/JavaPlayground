package cote.ecoteJava;

import java.util.HashSet;
import java.util.Scanner;

public class partSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        // 집합 정보 처리 => HashSet 라이브러리
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }

        // 손님 요청
        int m = sc.nextInt();
        int[] targets = new int[n];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님 확인 요청한 부품 번호 하나씩 확인
        for (int i = 0; i < m; i++) {
            // 해당 부품 존재하는지 확인
            if (s.contains(targets[i])) {
                System.out.println("");
            }
            else {
                System.out.println("");
            }
        }
    }
}
