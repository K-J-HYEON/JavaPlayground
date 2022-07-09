//import java.util.*;
//
//package cote.ecoteJava;
//
//import java.util.ArrayList;
//
//public class notMakePrice {
//
//    public static int n;
//    public static ArrayList<Integer> arrayList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            arrayList.add(sc.nextInt());
//        }
//
//        Collections.sort(arrayList);
//
//        int target = 1;
//        for (int i = 0; i < n; i++) {
//            // 만들 수 없는 금액 찾았을 떄 반복 종료
//            if (target < arrayList.get(i)) break;
//            target += arrayList.get(i);
//        }
//
//        System.out.println(target);
//    }
//}
