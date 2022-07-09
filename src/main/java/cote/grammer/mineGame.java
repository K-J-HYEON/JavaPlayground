package cote.grammer;

import java.util.Scanner;

public class mineGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 10;
        char[][] board = new char[SIZE][SIZE];
        char[][] mineBoard = {
                //    1  2  3  4  5  6  7  8  9
                {0, 0, 0, 0, 0, 1, 0, 0, 0},//1
                {1, 0, 0, 0, 0, 0, 0, 0, 0},//2
                {0, 0, 0, 0, 0, 1, 0, 0, 0},//3
                {0, 1, 0, 0, 0, 0, 0, 0, 0},//4
                {0, 0, 1, 0, 0, 0, 0, 0, 0},//5
                {0, 0, 0, 0, 0, 0, 0, 0, 1},//5
                {0, 0, 0, 0, 0, 0, 0, 1, 0},//7
                {0, 0, 0, 0, 0, 0, 0, 1, 0},//8
                {0, 0, 0, 0, 0, 0, 1, 0, 0},//9
        };
        int x = 0, y = 0;
        for (int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }

        while (true) {
            System.out.print("좌표 입력(종료 : 00) > ");
            String input = scanner.nextLine();
            if (input.length() == 2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';
                if (x == 0 && y == 0) {
                    System.out.println("게임 종료");
                    break;
                }
            }
            if (input.length() != 2 || x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("잘못 입력");
                continue;
            }
            board[x][y] = mineBoard[x - 1][y - 1] == 1 ? 'O' : 'X';
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    System.out.printf("%c\t", board[i][j]);
                }
                System.out.println();
            }
        }
    }
}
