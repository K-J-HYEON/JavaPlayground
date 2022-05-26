package hello.grammer.practice;

public class ifFor2 {
    public static void main(String[] args) {

        String a = "Man";
        int b = 0;

        if (a.equals("Man")) {
            System.out.println("남자입니다.");
        } else {
            System.out.println("남자입니다.");
        }

        if (b == 3) {
            System.out.println("b는 3입니다.");
        } else {
            System.out.println("3이 아님");
        }
        if (a.equalsIgnoreCase("man") && b == 0)
        {
            System.out.println("참");
        }
        else
        {
            System.out.println("거짓");
        }
    }
}

