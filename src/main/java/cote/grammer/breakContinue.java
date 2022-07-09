package cote.grammer;

public class breakContinue {
    public static void main(String[] args) {
        Loop1 :
        for (int i=2; i < 10; i++) {
            for (int j=1; j<10; j++) {
                if (j == 5) break; // 4가지 경우 수
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
    }
}
