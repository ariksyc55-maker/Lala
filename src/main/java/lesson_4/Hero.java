package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private int health;
    private int power;
    private String name;
    private String clazz;
    private int maxStrongestAttacks;
    private int usedStrongestAttacks;
    private double criticalChance;
    private double criticalMultiplier;

    private List<PotionType> potions = new ArrayList<>();

    public double getCriticalChance() {
        return criticalChance;
    }

    public double getCriticalMultiplier() {
        return criticalMultiplier;
    }

    public void setCriticalMultiplier(double criticalMultiplier) {
        this.criticalMultiplier = criticalMultiplier;
    }

    public void setCriticalChance(double criticalChance) {
        this.criticalChance = criticalChance;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public String getClazz() {
        return clazz;
    }

    public int getMaxStrongestAttacks() {
        return maxStrongestAttacks;
    }

    public int getUsedStrongestAttacks() {
        return usedStrongestAttacks;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public List<PotionType> getPotions() {
        return potions;
    }

    public void setPotions(List<PotionType> potions) {
        this.potions = potions;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public void setMaxStrongestAttacks(int maxStrongestAttacks) {
        this.maxStrongestAttacks = maxStrongestAttacks;
    }

    public void setUsedStrongestAttacks(int usedStrongestAttacks) {
        this.usedStrongestAttacks = usedStrongestAttacks;
    }


    public void addPotion(PotionType type, int quantity) {
        for (int i = 0; i < quantity; i++){
            potions.add(type);
        }

        System.out.println("Добавлено в инвентарь: " + quantity + "x " + type.getDisplayName());
    }

    public boolean doesHavePotion(PotionType type) {
        return getPotionCount(type) > 0;
    }

    public int getPotionCount(PotionType type) {
        int count = 0;
        for (PotionType potionType : potions) {
            if (potionType == type ) {
                count++;
            }
        }
        return count;
    }


    public void usePotion(PotionType potionType) {
        boolean potionUsed = false;
        for (PotionType type : potions) {
            if (type == potionType) {
                type.use(this);
                potions.remove(type);
                potionUsed = true;
                break;
            }
        }
        if (!potionUsed) {
            System.out.println("У вас нет зелий типа " + potionType.getDisplayName() + "! Пропуск хода");
        }
    }

    public void addAnAttack(int amount) {
        this.maxStrongestAttacks += amount;
        System.out.println(this.name + " добавил " + amount + "атаку");
    }

    public void heal(int amount) {
        this.health += amount;
        System.out.println(this.name + " восстановил " + amount + " HP.");
    }

    public void voice() {
        System.out.println("Я представитель класса " + clazz + ". Моё имя " + name);
        System.out.println(" - У меня здоровье " + health + " и моя сила " + power);    //вывод значений добавить через цикл
        System.out.println(" - Зелий исцеления: " + getPotionCount(PotionType.HEALING));
        System.out.println(" - Зелий восстановления атак: " + getPotionCount(PotionType.STRONGEST_ATTACK));
        System.out.println();
    }

    public void performStandardAttack(Hero targetHero) {
        double randomChance = Math.random() * 100;
        if (randomChance <= this.getCriticalChance()) {
            int criticalDamage = (int) (this.getPower() * this.getCriticalMultiplier());
            targetHero.takeDamage(criticalDamage);
            System.out.println(this.getName() + " наносит КРИТИЧЕСКИЙ УДАР! Урон: " + criticalDamage);
        } else {
            targetHero.takeDamage(this.getPower());
            System.out.println(this.getName() + " наносит удар. Урон: " + this.getPower());
        }
    }

    public int getAvailableStrongAttacks() {
        return this.maxStrongestAttacks - this.usedStrongestAttacks;
        }

    public void performStrongestAttack(Hero targetHero) {
        int maxPower = this.power * 2;
        targetHero.takeDamage(maxPower);
        System.out.println(this.name + " наносит сильнейший удар! Урон: " + maxPower);
        this.usedStrongestAttacks++;
    }

    public int getHealth() {
        return this.health;
    }

    public boolean isAlive() {
        return this.getHealth() > 0;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
        if (this.health < 0) {
            this.health = 0;
        }
    }
    public void reactToDefeat() {
        if (this.health <= 0) {
            System.out.println(this.name + ": Я пал в бою, это был честный поединок...");
        } else {
            System.out.println(this.name + ": Я ранен, но могу продолжать сражаться!");
        }
    }

    public void declareVictory() {
        System.out.println(this.name);
    }
}