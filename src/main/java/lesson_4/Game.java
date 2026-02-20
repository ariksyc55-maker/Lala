package lesson_4;

import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;
import lesson_4.hero.Warrior;

public class Game {
    public static void main(String[] args) {

        Warrior warriorOne = new Warrior("Артур", 200, 45);

        Warrior warriorTwo = new Warrior("Фростморн", 200, 40);

        Mage mageOne = new Mage("Ягерместер", 100, 50);

        Mage mageTwo = new Mage("Ильестр", 120, 45);

        Rogue rogueOne = new Rogue("Берсек", 120, 50);

        Rogue rogueTwo = new Rogue("Брианна", 150, 40);

        attack(warriorOne, mageOne);
    }

    public static void getVoice(Hero hero) {
        hero.voice();
    }

    public static void attack(Hero attackHero, Hero targetHero) {
        System.out.println("======БИТВА НАЧИНАЕТСЯ======");
        System.out.println();
        System.out.println(attackHero.name + " ПРОТИВ " + targetHero.name);
        System.out.println("Первый ход: " + attackHero.name);
        attackHero.sayWinnerWord();
        attackHero.attack(targetHero);
        targetHero.voice();
        attackHero.voice();
        targetHero.theLossWords();
        System.out.println();

        System.out.println("Второй ход: " + targetHero.name);
        targetHero.attack(attackHero);
        System.out.println();
        targetHero.voice();
        attackHero.voice();
        attackHero.theLossWords();
    }
}
