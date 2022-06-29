///**
// * 게임의 규칙에 따라 현무가 승리할 수 있는 경우의 수가 존재하는지 검사하는 함수
// * @param data
// * @param n
// * @param k
// * @return true 현무가 승리할 수 있는 경우의 수가 하나 이상 존재한다면
// * @return false else
// */
//
//
//
//package cote;
//
//public class winManipul {
//        public static boolean isWinnable(int[] data, int n, int k) {
//            int winCount = 0;
//            long sum = 0;
//            for (int i = 0; i < k; i += 1){
//                sum += data[i];
//            }
//            // sum := 가장 왼쪽 첫 번째 윈도우의 합
//            if( sum % 2 == 0){
//                return true;
//            }
//            for (int i = 1; i + k - 1 < n; i += 1) {
//                // 2번째 윈도우 ~ 마지막 윈도우
//                // i번째 범위 : data[i] ~ data[i+k-1] 범위를 나타낸다
//
//                // sum := data[i - 1] ~ data[i+k-2] 범위의 합을 가지고 있다
//                // (즉, 직전의 윈도우에 대한 값을 가지고 있다)
//                // 빠져나갈 왼쪽값 제거하고, 들어오는 오른쪽값 추가
//                sum = sum - data[i-1] + data[i+k-1];
//                // sum :=  data[i] ~ data[i+k-1] 범위의 합을 가지고 있다
//                if (sum % 2 == 0) {
//                    return true;
//                }
//
//            }
//            return false;
//
//            if(winCount > 0)
//            {
//                return true;
//            } else {
//                return false;
//            }
//        }
//}
