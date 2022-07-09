package cote.grammer;

public class Overloading {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate(",", "1", "2", "3", "4", "5"));

        System.out.println(concatenate("-",strArr));
    }

    static String concatenate(String delim, String... args) {
        String result = "";
        for (String str: args) {
            result += str + delim;
        }

        return result;
    }
}
