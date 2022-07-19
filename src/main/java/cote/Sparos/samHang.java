package cote.Sparos;

public class samHang {

    public static void main(String[] args) {
        boolean isMarried = true;
        boolean isMan = false;

        String str;

        str = isMarried ? "결혼 했다" : "결혼 안 했다";

        if (isMarried) {
            str = "결혼 했다";
        } else {
            str = "결혼 안 했다";
        }

        switch (str) {
            case "결혼 했다":
                System.out.println("O");
                break;
            case "결혼 안 했다":
                System.out.println("X");
            default:
                System.out.println("?");
        }

        System.out.println(str);
    }
}
