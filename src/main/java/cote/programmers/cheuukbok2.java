
//
//class Solution {
//    public int solution(int n, int[] lost, int[] reserve) {
//        // 1. student 배열 생성
//        int[] student = new int[n + 2];
//        int answer = 0;
//
//        // 2. reserve / lost 정보 반영
//        for (int l : lost)
//            student[l]--;
//        for (int r : reserve)
//            student[r]++;
//
//        // 3. 여분을 기준으로 앞뒤를 확인하여 체육복을 빌려줌
//        for (int i = 1; i <= n; i++) {
//            if (student[i] == 1) {
//                if (student[i - 1] == -1) {
//                    student[i]--;
//                    student[i - 1]++;
//                } else if (student[i + 1] == -1) {
//                    student[i]--;
//                    student[i + 1]++;
//                }
//            }
//        }
//
//        // 체육복을 갖고 있는 학생 수를 계산
//        for (int i = 1; i <= n; i++)
//            if (student[i] > -1)
//                answer++;
//        return answer;
//    }
//
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        int[] lost = { 2, 4 };
//        int[] reserve = { 1, 3, 5 };
//        System.out.print(sol.solution(5, lost, reserve));
//    }
//}