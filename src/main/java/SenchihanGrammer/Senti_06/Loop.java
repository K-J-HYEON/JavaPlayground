package SenchihanGrammer.Senti_06;

public class Loop {
    public static void main(String[] args) {

        boolean[] hairArr = {true, false, true, false, true, true, true};
        int whiteHairCnt = 0;
        // for-each
        for (boolean hairOne : hairArr) {
            if (whiteHairCnt == 5) {
                break;
            }
            if (hairOne) {
                System.out.println("뽑았다");
                whiteHairCnt = whiteHairCnt + 1;
            } else {
                System.out.println("안 뽑았다");
            }
        }
    }
}

    //        while (whiteHairCnt != 5) {
//            if (hair[cnt]) {
//                System.out.println("뽑았다");
//                whiteHairCnt = whiteHairCnt + 1;
//            } else {
//                System.out.println("안 뽑았다");
//            }
//
//            cnt++; //0 -> 1
//        }
//    }