package cote.ecoteJava;

import java.util.Scanner;

public class chessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 현재 나이트 위치 입력
        String inputData = sc.nextLine();
        int row = inputData.charAt(1) - '0';
        int column = inputData.charAt(0) - 'a' + 1;

        // 나이트가 이동할 수 있는 8가지 방향
        int[] dx = {};
        int[] dy = {};

        // 8가지 방향에 대해 각 위치로 이동 가능한지 확인
        int result = 0;
        for (int i = 0; i < 8; i++) {
            // 이동하고자 하는 위치
            int nextRow = row + dx[i];
            int nextColumn = column + dx[i];
            if (nextRow >= 1 && nextRow <= 8 && nextColumn >= 1 && nextColumn <= 8) {
                result += 1;
            }
        }
        System.out.println(result);
    }
}

