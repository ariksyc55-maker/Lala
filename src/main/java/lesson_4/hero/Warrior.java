package lesson_4.hero;

import lesson_4.Hero;

public class Warrior extends Hero {
    public Warrior(String name, int health, int power){
        clazz = "Воин";
        this.name = name;
        this.health = health;
        this.power = power;
    }
    public void attack(Hero target){
        System.out.println(this.name + ": Наносит Сильнейший Удар мечом по" + target.name);
        target.takeDamage(target.power);
    }
    public void theWinnerWord(){
        System.out.println(this.name + ": Почуствую мою мощь");
    }
}