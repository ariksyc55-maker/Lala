package lesson_4.hero;

import lesson_4.Hero;

public class Rogue extends Hero {
    public Rogue(String name, int health, int power) {
        setClazz("Разбойник");
        this.setName(name);
        this.setHealth(health);
        this.setPower(power);
        this.setMaxStrongestAttacks(2);
        this.setUsedStrongestAttacks(0);
        this.setCriticalChance(25.0);
        this.setCriticalMultiplier(1.5);
        voice();
    }

    public void performStandardAttack(Hero target) {
        double randomChance = Math.random() * 100;

        if (randomChance <= this.getCriticalChance()) {
            int criticalDamage = (int) (this.getPower() * this.getCriticalMultiplier());
            target.takeDamage(criticalDamage);
            System.out.println(this.getName() + " наносит точный удар кинжалом! КРИТИЧЕСКОЕ ПОПАДАНИЕ: " + criticalDamage + " (+20%)");
        } else {
            target.takeDamage(this.getPower());
            System.out.println(this.getName() + " атакует кинжалами. Урон: " + this.getPower());
        }
    }

    public void performStrongestAttack(Hero targetHero) {
        if (getUsedStrongestAttacks() >= getMaxStrongestAttacks()) {
            System.out.println(this.getName() + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 70;
        targetHero.takeDamage(maxPower);
        this.setUsedStrongestAttacks(this.getUsedStrongestAttacks() + 1);
        System.out.println(this.getName() + " наносит скрытый удар: " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(this.getName() + " Я разогнался");
    }
}
