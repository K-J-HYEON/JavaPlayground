import java.util.Scanner;

public class bingoGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SIZE = 5;
        int x = 0, y =0, tmp = 0, input = 0;
        int[][] bingo = new int[SIZE][SIZE];
        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                bingo[i][j] = i * SIZE + j + 1;
            }
        }

        for (int i=0; i<SIZE; i++) {
            for (int j=0; j<SIZE; j++) {
                x = (int) (Math.random() * SIZE);
                y = (int) (Math.random() * SIZE);
                tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }

        do {
            System.out.print("숫자 입력(1~25) > ");
            input = scanner.nextInt();
            OUTER:
            for (int i=0; i<SIZE; i++) {
                for (int j=0; j<SIZE; j++) {
                    if (input == bingo[i][j]) {
                        bingo[i][j] = 0;
                    } else if (input == 0) break OUTER;
                    System.out.printf("%3d\t",bingo[i][j]);
                }
                System.out.println();
            }
        } while (input != 0);
    }
}