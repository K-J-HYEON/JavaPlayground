package SenchihanGrammer.Senti_04;

public class Me extends Pa{
    public static void main(String[] args) {

        // class make / call
        GrandPa g = new GrandPa();
        Pa f = new Pa();
        Me m = new Me();

        System.out.println("bag = " + m.bag);
        System.out.println("bag = " + f.bag);

        Pa ff = new Me();

        System.out.println("bag :: " + ff.bag);
        Me mf = (Me) ff;
//        System.out.println("bag :asdfasdfasdf111: " + );

        // Up - cast - auto
        GrandPa gg = new Pa(); // auto
//        Pa ff = new Me();
        GrandPa gf = new Me();



        // Down - cast
//        Pa f4 = (Pa) gg;
        Me mm = (Me) gf;
        Object obj = 10;




    }
}
