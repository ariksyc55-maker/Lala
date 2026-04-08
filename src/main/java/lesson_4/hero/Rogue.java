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
        this.setUsedStrongestAttacks(this.getUsedStrongestAttacks() + 1);
        System.out.println(this.getName() + " наносит скрытый удар: " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(this.getName() + " Я разогнался");
    }

    public void announceAttack() {
        System.out.println(this.getName() + ": Готовится нанести удар");
    }
}
