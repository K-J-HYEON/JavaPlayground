package cote.grammer;

public class minMax {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = num[0], min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) max = num[i];
            else if (min > num[i]) min = num[i];
        }
        System.out.printf("%d\t%d", max,min);
    }
}
