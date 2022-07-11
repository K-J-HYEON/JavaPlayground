package cote.doit;

import java.util.Scanner;
import java.util.Stack;

public class stack1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // 개수 만큼 a배열 만들기
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1;
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        for(int i=0; i<A.length; i++) {
            int su = A[i];
            // 배열의 있는 값이 현재 오름차수에 있는 값 보다 큰 경우
            if(su >= num) {
                while(su>=num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                // 스택 pop 결과값이 수열의 수보다 크면 no 출력
                int n = stack.pop();
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }//
                else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}
