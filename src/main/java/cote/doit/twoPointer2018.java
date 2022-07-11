package cote.doit;

import java.util.Scanner;

public class twoPointer2018 {
    public static void main(String[] args) {
        // 수도코드 작성 해보기
//        N 변수 저장
//        사용 변수 초기화(count = 1, start_index = 1, end_index = 1, sum = 1)
//        while(end_index != N) {
//            if (sum == N) count 증가, end_index 증가, sum값 변경
//            else if(sum > N) sum값 변경, start_index 증가
//                else if (sum < N) end_index 증가, sum값 변경
//        }
//
//        count 출력하기

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;
        while(end_index != N) {
            if(sum==N) {
                count++; end_index++; sum = sum + end_index;
            }else if(sum > N) {
                sum = sum - start_index;
                start_index++;
            }else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
