package lesson_4.hero;

import lesson_4.Hero;

public class Warrior extends Hero {
    public Warrior(String name, int health, int power) {
        clazz = "Воин";
        this.name = name;
        this.health = health;
        this.power = power;
        this.maxStrongestAttacks = 2;
        this.usedStrongestAttacks = 0;
        voice();
    }

    public void theStandardAttack(Hero target) {
        System.out.println(this.name + " наносит удар мечом " + target.name);
        target.takeDamage(this.power);
    }

    public void theStrongestAttack(Hero targetHero) {
        if (usedStrongestAttacks >= maxStrongestAttacks) {
            System.out.println(this.name + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 60;
        targetHero.takeDamage(maxPower);
        usedStrongestAttacks++;
        System.out.println(targetHero.name + " нанес разрушвющий удар " + maxPower + " урона.");
    }

    public void wordsOfThreat() {
        System.out.println(this.name + ": Почуствуй мою мощь");
    }

    public void sayBeforeAttack() {
        System.out.println(this.name + ": атакует");
    }
}