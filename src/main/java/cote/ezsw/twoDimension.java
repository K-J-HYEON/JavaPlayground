package cote.ezsw;

import java.util.Scanner;

public class twoDimension {
    static int Row, Col;
    static int[][] Board = new int[100][100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Row = sc.nextInt();
        Col = sc.nextInt();
        for (int i = 0; i < Row; ++i)
            for (int j = 0; j < Col; ++i)
                Board[i][j] = sc.nextInt();

        for (int i = 0; i < Row; ++i) {
            for (int j = 0; j < Col; ++i) {
                System.out.println(Board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
