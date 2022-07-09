package cote.grammer;

public class studentScore {
    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        int korSum = 0, engSum = 0, matSum = 0;
        System.out.println("번호\t\t국어\t\t영어\t\t수학\t\t총합\t\t평균");
        System.out.println("============================================");
        for (int i=0; i<score.length; i++) {
            int sum = 0;
            float avg = 0;
            korSum += score[i][0];
            engSum += score[i][1];
            matSum += score[i][2];
            System.out.printf("%d\t", i + 1);
            for (int j=0; j<score[i].length; j++) {
                sum += score[i][j];
                avg = (float) sum / score[i].length;
                System.out.printf("\t%3d\t", score[i][j]);
            }
            System.out.printf("\t%3d\t\t%3.1f\n",sum,avg);
        }
        System.out.println("============================================");
        System.out.printf("총점 :\t%3d\t\t%3d\t\t%3d",korSum,engSum,matSum );
    }
}
