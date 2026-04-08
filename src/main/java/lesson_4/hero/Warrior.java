package lesson_4.hero;

import lesson_4.Hero;

public class Warrior extends Hero {
    public Warrior(String name, int health, int power) {
        setClazz("Воин");
        this.setName(name);
        this.setHealth(health);
        this.setPower(power);
        this.setMaxStrongestAttacks(2);
        this.setUsedStrongestAttacks(0);
        this.setCriticalChance(10.0);
        this.setCriticalMultiplier(1.3);
        voice();
    }

    public void performStandardAttack(Hero target) {
        double randomChance = Math.random() * 100;

        if (randomChance <= this.getCriticalChance()) {
            int criticalDamage = (int) (this.getPower() * this.getCriticalMultiplier());
            target.takeDamage(criticalDamage);
            System.out.println(this.getName() + " наносит МОЩНЫЙ УДАР мечом! КРИТИЧЕСКИЙ УРОН: " + criticalDamage);
        } else {
            target.takeDamage(this.getPower());
            System.out.println(this.getName() + " наносит удар мечом. Урон: " + this.getPower());
        }
    }

    public void performStrongestAttack(Hero targetHero) {
        if (getUsedStrongestAttacks() >= getMaxStrongestAttacks()) {
            System.out.println(this.getName() + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 60;
        targetHero.takeDamage(maxPower);
        this.setUsedStrongestAttacks(this.getUsedStrongestAttacks() + 1);
        System.out.println(this.getName() + " нанес разрушвющий удар " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(this.getName() + ": Почуствуй мою мощь");
    }
}