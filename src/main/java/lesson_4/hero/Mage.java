package lesson_4.hero;

import lesson_4.Hero;

public class Mage extends Hero {
    public Mage(String name, int health, int power) {
        clazz = "Маг";
        this.name = name;
        this.health = health;
        this.power = power;
        this.maxStrongestAttacks = 2;
        this.usedStrongestAttacks = 0;
        voice();
    }

    public void performStandardAttack(Hero target) {
        System.out.println(this.getName() + ": Выпуская огненный шар в " + target.getName());
        target.takeDamage(this.getPower());
    }

    public void performStrongestAttack(Hero targetHero) {
        if (getUsedStrongestAttacks() >= getMaxStrongestAttacks()) {
            System.out.println(this.getName() + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 50;
        targetHero.takeDamage(maxPower);
        usedStrongestAttacks++;
        System.out.println(this.getName() + " призывает сильнейшее заклинание огня: " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(" Я " + this.getName() + " сожгу тебя дотла");
    }

    public void announceAttack() {
        System.out.println(this.getName() + ": создает атакуещие заклинание");
    }
}
