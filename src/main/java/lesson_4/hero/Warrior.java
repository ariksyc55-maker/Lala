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
    public void theStandardAttack(Hero target){
        System.out.println(this.name + " наносит удар мечом " + target.name);
        target.takeDamage(this.power);
    }
    public void theStrongestAttack(Hero targetHero){
        int maxPower = 60;
        targetHero.takeDamage(maxPower);
        System.out.println(targetHero.name + " нанес разрушвющий удар " + maxPower + " урона.");
    }

    public void wordsOfThreat(){
        System.out.println(this.name + ": Почуствуй мою мощь");
    }
    public void sayBeforeAttack() {
        System.out.println(this.name + ": атакует");
    }
}