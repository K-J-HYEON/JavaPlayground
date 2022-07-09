package cote.ecoteJava;

import java.util.*;

public class guild {

    public static int n;
    public static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String[] arges) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }

        Collections.sort(arrayList);

        int result = 0; // 총 그룹 수
        int count = 0; // 현재 그룹에 포함된 모험가 수

        for (int i = 0; i < n; i++) { // 공포도를 낮은 것부터 하나씩 확인
            count += 1; // 현재 그룹에 해당 모험가 포함
            if (count >= arrayList.get(i)) { // 현재 그룹에 포함된 모험가의 수가 현재의 공포도 이상이라면, 그룹 결성
                result += 1; // 총 그룹의 수 증가시키기
                count = 0; // 현재 그룹에 포함된 모험가의 수 초기화
            }
        }
        System.out.println(result);
    }

    public static class alRe {

        public static String str;
        public static int count0 = 0; // 전부 0으로 바꾸는 경우
        public static int count1 = 0; // 전부 1로 바꾸는 경우

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            str = sc.next();

            // 첫 번째 원소에 대해서 처리
            if (str.charAt(0) == '1') {
                count0 += 1;
            }
            else {
                count1 += 1;
            }

            // 두 번째 원소부터 모든 원소를 확인하며
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) != str.charAt(i + 1)) {
                    // 다음 수에서 1로 바뀌는 경우
                    if (str.charAt(i + 1) == '1') count0 += 1;
                    // 다음 수에서 0으로 바뀌는 경우
                    else count1 += 1;
                }
            }

            System.out.println(Math.min(count0, count1));
        }
    }
}
