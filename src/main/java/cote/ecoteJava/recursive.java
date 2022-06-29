package cote.ecoteJava;

public class recursive {

    public static void recursiveFunction(int i) {
        if (i == 100) return;
        System.out.println("recursive.main");
        recursiveFunction(i + 1);
        System.out.println("");

    }

    public static void main(String[] args) {
        recursiveFunction(1);
    }
}
