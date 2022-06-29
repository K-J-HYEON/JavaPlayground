package SenchihanGrammer.chap3;

import SenchihanGrammer.chap3_2.nextfriend;

public class me extends pa{


    public int 집앞골목 = 0;
    int 마당 = 0;
    protected int 화장실 = 100;
    private int 가방 = 1;

    // 접근제어지시자

    public static void main(String[] args) {

        pa papa = new pa();

        // bag 아빠의 가방 >>> 가방을 가리키고 있다.
        int bag = papa.getBag();


        grandpa grapndpapa = new grandpa();

        nextfriend nextfriendd = new nextfriend();

    }
}
