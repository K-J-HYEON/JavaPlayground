package hello.grammer.practice;

public class factorial {

    public static int factorial(int number) {
        if (number == 1)
            return 1;
        else
            return number * factorial(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("10 팩토리얼은 " + factorial(10));

    }
}
