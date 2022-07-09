//package cote.grammer;
//
//public class Deck {
//    final int CARD_NUM = 52;
//    Card[] cardArr = new Card[CARD_NUM];
//
//    Deck() { // 카드 초기화
//        int i = 0;
//        for (int k = Card.KIND; k > 0; k--) {
//            for (int n = 0; n < Card.NUM; n++) {
//                cardArr[i++] = new Card(k, n + 1);
//            }
//        }
//    }
//
//    Card pick(int index) {
//        return cardArr[index];
//    }
//
//    Card pick() {
//        int index = (int) (Math.random() * CARD_NUM);
//        return cardArr[index];
//    }
//
//    void shuffle() {
//        for (int i = 0; i < cardArr.length; i++) {
//            int index = (int) (Math.random() * CARD_NUM);
//            Card temp = cardArr[i];
//            cardArr[i] = cardArr[index];
//            cardARR[index] = temp;
//        }
//    }
//}
