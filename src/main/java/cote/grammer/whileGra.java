package cote.grammer;

import java.util.Scanner;

public class whileGra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자 입력 : ");
        String tmp = scanner.nextLine();
        int number = Integer.parseInt(tmp);
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);
    }
}
