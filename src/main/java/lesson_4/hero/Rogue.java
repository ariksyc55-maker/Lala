package lesson_4.hero;

import lesson_4.Hero;

public class Rogue extends Hero {
     public Rogue(String name, int health, int power){
         clazz = " Разбойник";
         this.name = name;
         this.health = health;
         this.power = power;
     }

    public void attack(Hero target) {
        System.out.println(this.name + ": Делает внезапную атаку " + target.name);
        target.takeDamage(this.power);
    }

    public void wordsOfThreat() {
        System.out.println(this.name + " Я разогнался");
    }
    public void wordsBeforeTheAttack() {
        System.out.println(this.name + ": Готовится нанести удар");
    }
}
