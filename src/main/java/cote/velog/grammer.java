package cote.velog;

import java.util.*;

public class grammer {
    public static void main(String[] args) {
        String str = "abcde";
        int a = str.length();
        boolean b = str.isEmpty();
        System.out.println(a);
        System.out.println(b);

        int c = str.charAt(2);
        int d = str.indexOf("c");
        int e = str.lastIndexOf("c");

        String aa = str.substring(2, 4);
        String bb = str.substring(3);

        System.out.println(aa);
        System.out.println(bb);

        String aaa = str.replace('b', 'k');
        boolean aaaa = str.equals("abcde");
        System.out.println(aaaa);

        boolean bbbb = str.contains("bc");
        System.out.println(bbbb);

        String cc = str.trim();
        System.out.println(cc);

        String dd = str.toLowerCase();
        String ee = str.toUpperCase();

        System.out.println(ee);

        Integer f = str.compareTo("abcdd");
        System.out.println(f);

        Integer g = Integer.parseInt("300");
        System.out.println(g);

        String h = Integer.toString(300);
        System.out.println(h);


        // StringBuilder 관련 메소드
        StringBuilder sb = new StringBuilder();

        sb.append("abc");
        System.out.println(sb);
        sb.insert(2, "kk");
        System.out.println(sb);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.setCharAt(0, 'h');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        sb.setLength(2);
        System.out.println(sb);
        sb.setLength(4);


        // List 관련 메소드
//        List<String> list = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//        list.add(1, "대전");
//        list.addAll(list2);
//
//        list.get(0);
//        list.set(0, "대구");
//
//        list.indexOf("대구");
//        list.lastIndexOf("대구");
//
//        list.remove(0);
//        list.remove("대구");
//        list.removeAll(list2);
//        list.retainAll(list2);
//
//        list.clear();
//        list.isEmpty();
//        list.size();
//
//        list.contains("서울");
//        list.containsAll(list2);

//        list.removeIf(k -> k % 2 != 0); // 람다식 -> 홀수를 list에서 모두 제거

        int[] arr = {1123, 1412, 23, 44, 512132};
        List<Integer> list = new ArrayList(Arrays.asList(arr));

        Collections.max(list); // list의 원소 중 가장 큰 값 반환
        Collections.min(list); // list의 원소 중 가장 작은 값 반환

        Collections.sort(list); // 오름차순 정렬
        Collections.sort(list, Collections.reverseOrder()); // list 내림차순 정렬

        Collections.reverse(list);

        Collections.frequency(list, 23);

        Collections.binarySearch(list, 24);

        System.out.println(list);

    }
}




