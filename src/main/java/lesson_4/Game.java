package lesson_4;

import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;
import lesson_4.hero.Warrior;

public class Game {
    public static void main(String[] args) {

        Warrior warriorOne = new Warrior("Артур", 200, 45);

        Warrior warriorTwo = new Warrior("Фростморн", 200, 40);

        Mage mageOne = new Mage();
        mageOne.name = "Ягермейстер";
        mageOne.health = 100;
        mageOne.power = 50;

        Mage mageTwo = new Mage();
        mageTwo.name = "Ильестр";
        mageTwo.health = 120;
        mageTwo.power = 45;

        Rogue rogueOne = new Rogue();
        rogueOne.name = "Берсек";
        rogueOne.health = 120;
        rogueOne.power = 50;

        Rogue rogueTwo = new Rogue();
        rogueTwo.name = "Брианна";
        rogueTwo.health = 150;
        rogueTwo.power = 40;


        getVoice(mageOne);
        getVoice(mageTwo);
        getVoice(rogueOne);
        getVoice(rogueTwo);

        attack(warriorOne, mageOne);
    }

    public static void getVoice(Hero hero) {
        hero.voice();
    }

    public static void attack(Hero attackHero, Hero targetHero) {
        System.out.println("======БИТВА НАЧИНАЕТСЯ======");
        System.out.println();
        System.out.println(attackHero.name + " ПРОТИВ " + targetHero.name);
        attackHero.attack(targetHero);
        attackHero.sayWinnerWord();
        targetHero.voice();
        attackHero.voice();

        targetHero.theLossWords();
        System.out.println();
    }
}
