package cote.grammer;

import java.util.Arrays;

public class Array {
//    public static void main(String[] args) {
//        int[] num = {};
//        System.out.println(Arrays.toString(num));
//    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9};
        int[] newNum = new int[num.length * 2];
        for (int i = 0; i < num.length; i++) {
            newNum[i] = num[i];
        }
        num = newNum;
        System.out.println(Arrays.toString(newNum));
    }

//    public static void main3(String[] args) {
//        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] newNum = new int[num.length * 2];
//        System.arraycopy(num, 0, newNum, 0, num.length);
//        System.out.println(Arrays.toString(newNum));
//    }
}
