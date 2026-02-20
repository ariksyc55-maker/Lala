package lesson_4.hero;

import lesson_4.Hero;

public class Mage extends Hero {
    public Mage(String name, int health, int power){
        clazz = "Маг";
        this.name = name;
        this.health = health;
        this.power = power;
        voice();
    }
    public void attack(Hero target){
        System.out.println(this.name + ": Выпуская огненный шар в " + target.name);
        target.takeDamage(this.power);
    }
    public void wordsOfThreat(){
        System.out.println(" Я " + this.name + " сожгу тебя до тла");
    }
    public void wordsBeforeTheAttack() {
        System.out.println(this.name + ": создает атакуещие заклинание");
    }
}
