package cote.Sparos;

import java.util.ArrayList;

public class overLoad {

    public static void main(String[] args) {
        System.out.println(add(50, 10));
        System.out.println(add(50, 10, 30));
        System.out.println(add(1, 2, 3, 4, 5));

        Person person = new Person();
        Person person2 = new Person("홍길동", 10);

        System.out.println(person);
        System.out.println(person2);

        Hero hero = new Hero("슈퍼맨");
        Hero hero2 = new Hero("배트맨");
        hero.attack(hero2);

        Character character = new Hero("슈퍼맨2");

        Magician megician = new Magician();
        Character megician2 = new Magician();
        ICharacter megician3 = new Magician();

        ArrayList<Character> characterArrayList = new ArrayList<>();
        characterArrayList.add(megician);
        characterArrayList.add(megician2);
        characterArrayList.add(hero);
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static int add(int... numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + i;
        }
        return sum;
    }
}