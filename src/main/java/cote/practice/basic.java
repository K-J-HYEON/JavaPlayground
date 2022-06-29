//package cote.practice;
//
//import java.util.*;
//
//public class basic {
//    public static void main(String[] args) {
//        int i = 100;
//        String s = Integer.toString(i);
//
//        char c = 'A';
//        String ss = Character.toString(c);
//
//        String sss = "123";
//        int ii = Integer.parseInt(s);
//
//        String ssss = "123";
//        double d = Double.parseDouble(s);
//
//        Integer[] result = {0, 8, 0, 1};
//        List<Integer> relist = Arrays.asList(result);
//
////        Arrays.sort(arr);
//
////        Integer[] result = {0, 8, 0, 1};
//        Collections.reverse(Arrays.asList(result));
//
//        String s1 = "abcd";
//        s = new StringBuilder(s1).reverse().toString();
//
//        Stack stack = new Stack<>();
//
//        stack.push(0);
//        stack.pop();
//
//        while(!stack.empty()){
//            stack.pop();
//        }
//
//        System.out.println(stack);
//
//
//        Map<Character, Character> map = new HashMap<>();
//        map.put('key', 'value');
//
//        if (map.containsKey('key')) {
//            map.get('key');
//        }
//
//        HashSet<Integer> hs = new HashSet<>();
//        for (int i : nums) {
//            if ( hs.contains(i)) {
//                hs.remove(i);
//                // hs.clear();// 모든 값 제거
//            } else {
//                hs.add(i);
//            }
//        }
//        return;
//        hs.iterator().next();
//
//        HashSet<Integer> set = new HashSet<Integer>(Arrays.asList(1, 2, 3)); // HashSet 생성
//
//        System.out.println(set); // 전체출력 [1, 2, 3]
//
//        Iterator iter = set.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }
//
//        String text = 'hello world!';
//        text.indexOf("hello");
//
//        StringBuilder sb = new StrihgBuilder();
//        stringBuilder.append("hello");
//
//        StringBuffer sf = new StringBuffer();
//        stringBuilder.append("hello");
//        String s = sf.toString();
//
//        String str = "HAPPYCODING";
//
//        str.substring(2);
//        str.substring(2, 6);
//
//        String str = "HAPPYCODING";
//
//        char c1 = str.charAt(0);
//        char c2 = str.charAt(3);
//
//        int x = Arrays.binarySearch(nums, target);
//
//        Arrays.sort(arr);
//
//        Math.max(10, 20);
//        Math.min(10, 20);
//
//        String s = "Hello";
//        s.toLowerCase();
//        s.toUpperCase();
//
//        String s = s.replaceAll("[^A-Za-z0-9]", "");
//        String s = s.replace(/(^0+)/, "");
//
//        int res = 0;
//        for(int num : nums) {
//            res ^= num;
//        }
//        return res;
//
//
//    }
//}
