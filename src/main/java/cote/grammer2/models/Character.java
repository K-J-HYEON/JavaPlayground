package cote.grammer2.models;

public abstract class Character extends Person{
    public abstract void attack(Hero hero);
}

interface ICharacter {
    void attack(Person person);
}
