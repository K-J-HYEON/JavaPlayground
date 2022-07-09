package cote.grammer;

public class factorial2 {
    static int factorial(int n) {
        if (n <= 0 || n > 12) {
            System.out.println("유효하지 않는 값!!");
            return -1;
        }
        else if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 13; i++)
            System.out.printf("%2d! = %10d\n",i,factorial(i));
    }
}
