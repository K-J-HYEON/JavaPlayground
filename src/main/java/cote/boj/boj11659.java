package cote.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj11659 {
    public static void main(String[] args) throws IOException {
        // 받는 데이터가 많으면 scanner 대신 bufferedReader를 쓴다.
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        // stringTokennizer으로 값을 분리해서 사용한다.
        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] S = new long[suNo + 1];
        stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        for(int i=1; i<=suNo; i++)
        {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }
        for(int q=0; q<quizNo; q++) {
            stringTokenizer =
                    new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
    }
}
