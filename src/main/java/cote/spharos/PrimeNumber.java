package cote.spharos;

public class PrimeNumber {
    public int solution(int n) {
        int answer = 1;
        boolean cnk = true;

        for (int i = 3; i <= n; ++i) {
            for (int j = 2; j < i; ++j) {
                if (i % j == 0) {
                    cnk = false;
                    break;
                }
            }
            if (cnk) ++answer;
            cnk = true;
        }
        return answer;
    }
}