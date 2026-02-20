package lesson_4.hero;

import lesson_4.Hero;

public class Warrior extends Hero {
    public Warrior(String name, int health, int power){
        clazz = "Воин";
        this.name = name;
        this.health = health;
        this.power = power;
        voice();
    }
    public void attack(Hero target){
        System.out.println(this.name + " наносит удар мечом " + target.name);
        target.takeDamage(this.power);
    }
    public void wordsOfThreat(){
        System.out.println(this.name + ": Почуствую мою мощь");
    }
    public void wordsBeforeTheAttack() {
        System.out.println(this.name + ": атакует");
    }
}