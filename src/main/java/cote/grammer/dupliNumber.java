package cote.grammer;

public class dupliNumber {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] count = new int[10];
        for (int i=0; i<arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i]);
            count[arr[i]]++;
        }
        System.out.println();
        for (int i=0; i<count.length; i++)
            System.out.printf("%d 갯수 : %d\n",i,count[i]);
    }
}
