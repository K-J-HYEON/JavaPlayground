//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//            List<Integer> answer = new ArrayList<Integer>();
//
//            for (int i = 0; i < progresses.length; i++) {
//                // 1. 한 개 기능을 개발하는데 필요한 날짜 계산
//                double days = (100 - progresses[i]) / (double) speeds[i];
//                int daysUp = (int) Math.ceil(days);
//
//                // 2. 함께 배포할 기능의 index 찾기
//                int j = i + 1;
//                for (; j < progresses.length; j++)
//                    if (progresses[j] + daysUp * speeds[j] < 100)
//                        break;
//
//                // 3. 이번에 배포할 기능의 개수를 추가하기
//                answer.add(j - i);
//                // 함께 배포할 수 없는 첫 번째 인덱스에서 현재 위치를 빼주면
//                i = j - 1;
//            }
//
////            int[] answerArray = new int[answer.size()];
////            for (int i = 0; i < answer.size(); i++)
////                answerArray[i] = answer.get(i);
////
////            return answerArray;
//
//            // 4. ArrayList를 array 형태로 변경하여 변환
//            // 그 객체가 가지고 있는 int값을 꺼내와라.
//            // answer는 integer의 array 였고 stream을 하고 나니까 integer 객체를 하나씩 꺼내 온 stream이 된 거
//            // int 값으로 변환을 한거고 intValue까지는 int의 Stream이 된거다.
//            // toArray[]를 해주면 int[]를 반환하게 되어있다.
//            return answer.stream().mapToInt(i -> i.intValue()).toArray();
//    }
//
//}
