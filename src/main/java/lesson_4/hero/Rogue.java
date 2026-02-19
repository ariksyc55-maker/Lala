package lesson_4.hero;

import lesson_4.Hero;

public class Rogue extends Hero {
     public Rogue(){
         clazz = " Разбойник";
     }

    public void attack(Hero target) {
        System.out.println(this.name + ": Делает внезапную атаку" + target.name);
        target.takeDamage(target.power);
    }

    public void theWinnerWord() {
        System.out.println(this.name + " Я разогнался");
    }
}
