package lesson_4;

import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;
import lesson_4.hero.Warrior;

public class Game {
    public static void main(String[] args) {

        Warrior warriorOne = new Warrior();
        warriorOne.name = "Артур";
        warriorOne.abilities = "Воинов";
        warriorOne.health = 200;
        warriorOne.power = 45;

        Warrior warriorTwo = new Warrior();
        warriorTwo.name = "Фростморн";
        warriorTwo.abilities = "Воинов";
        warriorTwo.health = 200;
        warriorTwo.power = 40;

        Mage mageOne = new Mage();
        mageOne.name = "Ягермейстер";
        mageOne.abilities = "Магов";
        mageOne.health = 100;
        mageOne.power = 50;

        Mage mageTwo = new Mage();
        mageTwo.name = "Ильестр";
        mageTwo.abilities = "Магов";
        mageTwo.health = 120;
        mageTwo.power = 45;

        Rogue rogueOne = new Rogue();
        rogueOne.name = "Берсек";
        rogueOne.abilities = "Разбойников";
        rogueOne.health = 120;
        rogueOne.power = 50;

        Rogue rogueTwo = new Rogue();
        rogueTwo.name = "Брианна";
        rogueTwo.abilities = "Разбойников";
        rogueTwo.health = 150;
        rogueTwo.power = 40;

        getVoice(warriorOne);
        getVoice(warriorTwo);
        getVoice(mageOne);
        getVoice(mageTwo);
        getVoice(rogueOne);
        getVoice(rogueTwo);
        battle(warriorOne, mageOne);
    }
    public static void getVoice(Hero convocation) {
        convocation.voice();
    }
    public static void battle(Hero attackHero,Hero targetHero){
        System.out.println("======БИТВА НАЧИНАЕТСЯ======");
        targetHero.health = targetHero.health - attackHero.power;
        System.out.println(targetHero);
    }
}
