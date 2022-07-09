package cote.grammer;



public class Class {
    static final int KIND = 4;
    static final int NUM = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;

    int kind;
    int number;

    Class() {
        this(SPADE, 1);
    }

    Class(int kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        String[] kind = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "012345678xjqk";

        return "kind : " + kind[this.kind] + ", number : " + numbers.charAt(this.number);
    }
}
