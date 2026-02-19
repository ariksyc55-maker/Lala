package lesson_4.hero;

import lesson_4.Hero;

public class Mage extends Hero {
    public Mage(){
        super();
    }
    public void attack(Hero target){
        System.out.println(this.name + ": Выпуская огненный шар в " + target.name);
        target.takeDamage(target.power);
    }
    public void theWinnerWord(){
        System.out.println(" Я " + this.name + " сожгу тебя до тла");
    }
}
