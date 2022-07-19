package cote.Sparos;

public class string {

    public static void main(String[] args) {
        // 정수
        long l = 30L;
        int x = 30;
        short s = 30;
        byte b = 30;

        int i = (int) 30L;
        long ll = 30; // int

        double dd = 30.0;
        float ff = 30.0f;

        dd = ff;
        ff = (float) dd;

        boolean isMarried = true;
        isMarried = false;

        char c = 'a';
        char cc = '한';

        String str = "여러 글자";

        System.out.printf("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.", "홍길동", 72, 169.5f);

        String str2 = String.format("저는 %s입니다. 나이는 %d살이고요, 키는 %fcm입니다.", "홍길동", 72, 169.5f);

        System.out.println(str2);

        }
}
