package hello.grammer.practice;

public class whileGrammer {

    final static int N = 30;

    public static void main(String[] args) {
        for(int i = N; i > 0; i--)
        {
            for(int j = i; j > 0; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
