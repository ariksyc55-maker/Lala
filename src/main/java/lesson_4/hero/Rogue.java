package lesson_4.hero;

import lesson_4.Hero;

public class Rogue extends Hero {
    public Rogue(String name, int health, int power) {
        clazz = "Разбойник";
        this.name = name;
        this.health = health;
        this.power = power;
        this.maxStrongestAttacks = 2;
        this.usedStrongestAttacks = 0;
        voice();
    }

    public void performStandardAttack(Hero target) {
        System.out.println(this.name + ": Делает внезапную атаку " + target.name);
        target.takeDamage(this.power);
    }

    public void performStrongestAttack(Hero targetHero) {
        if (usedStrongestAttacks >= maxStrongestAttacks) {
            System.out.println(this.name + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 70;
        targetHero.takeDamage(maxPower);
        usedStrongestAttacks++;
        System.out.println(this.name + " наносит скрытый удар: " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(this.name + " Я разогнался");
    }

    public void announceAttack() {
        System.out.println(this.name + ": Готовится нанести удар");
    }
}
