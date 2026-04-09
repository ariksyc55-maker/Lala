package lesson_4.hero;

import lesson_4.Hero;

public class Mage extends Hero {
    public Mage(String name, int health, int power) {
        setClazz("Маг");
        this.setName(name);
        this.setHealth(health);
        this.setPower(power);
        this.setMaxStrongestAttacks(2);
        this.setUsedStrongestAttacks(0);
        this.setCriticalChance(15.0);   //повысить шанс крита
        this.setCriticalMultiplier(1.4);
        voice();
    }

    public void performStandardAttack(Hero target) {
        double randomChance = Math.random() * 100;

        if (randomChance <= this.getCriticalChance()) {
            int criticalDamage = (int) (this.getPower() * this.getCriticalMultiplier());
            target.takeDamage(criticalDamage);
            System.out.println(this.getName() + " выпускает магический снаряд! КРИТИЧЕСКИЙ УДАР: " + criticalDamage + " (+20%)");
        } else {
            target.takeDamage(this.getPower());
            System.out.println(this.getName() + " использует заклинание. Урон: " + this.getPower()); //переделать в отдельный метод
        }
    }


    public void performStrongestAttack(Hero targetHero) {
        if (getUsedStrongestAttacks() >= getMaxStrongestAttacks()) {
            System.out.println(this.getName() + " не может использовать сильнейшую атаку - закончились снаряды");
            return;
        }
        int maxPower = 50;
        targetHero.takeDamage(maxPower);
        this.setUsedStrongestAttacks(this.getUsedStrongestAttacks() + 1);
        System.out.println(this.getName() + " призывает сильнейшее заклинание огня: " + maxPower + " урона.");
    }

    public void declareVictory() {
        System.out.println(" Я " + this.getName() + " сожгу тебя дотла");
    }
}
