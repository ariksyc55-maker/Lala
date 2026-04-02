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

    public void performStandardAttack(Hero target) {
        System.out.println(this.getName() + " наносит удар мечом " + target.getName());
        target.takeDamage(this.getPower());
    }

    public void performStrongestAttack(Hero targetHero) {
        if (getUsedStrongestAttacks() >= getMaxStrongestAttacks()) {
            System.out.println(this.getName() + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 60;
        targetHero.takeDamage(maxPower);
        getMaxStrongestAttacks()++;
        System.out.println(this.getName() + " нанес разрушвющий удар " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(this.getName() + ": Почуствуй мою мощь");
    }

    public void announceAttack() {
        System.out.println(this.getName() + ": атакует");
    }
}