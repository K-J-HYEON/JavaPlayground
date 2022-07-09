package cote.grammer;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        int answer = (int) ((Math.random() * 100) + 1);
        int input;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("1~100 사이 숫자를 맞추자 >> ");
            input = scanner.nextInt();
            if (answer > input) {
                System.out.println("큰 수를 입력하세요");
            } else if (answer < input) {
                System.out.println("작은 수를 입력하세요");
            } else {
                System.out.println("정답!");
                break;
            }
        } while (input != answer);
    }
}
