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
        System.out.println(this.getName() + ": Делает внезапную атаку " + target.getName());
        target.takeDamage(this.getPower());
    }

    public void performStrongestAttack(Hero targetHero) {
        if (getUsedStrongestAttacks() >= getMaxStrongestAttacks()) {
            System.out.println(this.getName() + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 70;
        targetHero.takeDamage(maxPower);
        usedStrongestAttacks++;
        System.out.println(this.getName() + " наносит скрытый удар: " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(this.getName() + " Я разогнался");
    }

    public void announceAttack() {
        System.out.println(this.getName() + ": Готовится нанести удар");
    }
}
