package cote.grammer;


class Data {int x;}
public class parameter {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println(d.x);
        changed(d);
        System.out.println(d.x);
    }

    static void changed(Data d) {
        d.x = 1000;
        System.out.println(d.x);
    }
}
