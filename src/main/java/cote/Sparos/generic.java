package cote.Sparos;


public class generic {
    public static void main(String[] args) {
        print("안녕");
        print(1);
        print(3L);
        print(3L);
    }

    private static <T> void print(T type) {
        System.out.println(type);
    }
}
