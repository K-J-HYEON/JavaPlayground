package cote.grammer;

public class element {
    public static void main(String[] args) {
        int[] lotto = new int[45];
        for (int i = 0; i < 45; i++) {
            lotto[i] = i + 1;
        }
        int tmp, ball;
        for (int i = 0; i < 6; i++) {
            ball = (int) (Math.random() * 45);
            // 0~45 중 랜덤으로 저장
            // lotto 배열 element를 무작위 뽑을 용도 만듦
            tmp = lotto[i];
            lotto[i] = lotto[ball];
            lotto[ball] = tmp;
            System.out.println(lotto[i]);
        }
    }
}
