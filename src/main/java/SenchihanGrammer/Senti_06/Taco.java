package SenchihanGrammer.Senti_06;

public class Taco {
    // class => 틀
    // method
    // 객체 = 타코야끼

    public Taco() {

    }

    public Taco(String str) {

    }

    public Taco(String str, int count) {

    }


    public static void main(String[] args) {
        Taco taco = new Taco( "문어", 20);
        taco.input("문어");
        taco.roll(20);

    }

    public void input(String master) {
        System.out.println(master + "가 들어간");

    }
    public void roll(int count) {
        System.out.println(count + "번 만큼 타지않게 돌린 타코야끼");
    }
}

class MakeTaco {
    public MakeTaco() {//default constructor
    }
}
