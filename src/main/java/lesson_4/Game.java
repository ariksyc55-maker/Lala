package lesson_4;

import java.util.Scanner;

import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;
import lesson_4.hero.Warrior;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- ДОБРО ПОЖАЛОВАТЬ В ИГРУ -----");
        System.out.println();

        Warrior warriorOne = new Warrior("Артур", 200, 45);
        Warrior warriorTwo = new Warrior("Фростморн", 200, 40);
        Mage mageOne = new Mage("Ягерместер", 100, 50);
        Mage mageTwo = new Mage("Ильестр", 120, 45);
        Rogue rogueOne = new Rogue("Берсек", 120, 50);
        Rogue rogueTwo = new Rogue("Брианна", 150, 40);

        Hero[] heroes = new Hero[6];
        heroes[0] = mageOne;
        heroes[1] = mageTwo;
        heroes[2] = warriorOne;
        heroes[3] = warriorTwo;
        heroes[4] = rogueOne;
        heroes[5] = rogueTwo;

        int choice = 0;
        while (choice < 1 || choice > heroes.length) {
            System.out.println("Выберите героя для сражения: ");
            printAllHeroes(heroes);
            System.out.println();
            choice = scanner.nextInt();
        }
        Hero firstHero = heroes[choice - 1];
        System.out.println("Вы выбрали: " + firstHero.name);
        System.out.println();

        choice = 0;
        while (choice < 1 || choice > heroes.length) {
            System.out.println("Выберите себе врага: ");
            printAllHeroes(heroes);
            System.out.println();
            choice = scanner.nextInt();
        }
        Hero opponent = heroes[choice - 1];
        System.out.println("Ваш противник: " + opponent.name);
        System.out.println();
        attack(firstHero, opponent, scanner);
        scanner.close();
    }

    public static void attack(Hero myHero, Hero opponent, Scanner scanner) {
        System.out.println("-----БИТВА НАЧИНАЕТСЯ-----");
        System.out.println("Сражаются: " + myHero.name + " (здоровье: " + myHero.health + ")");
        System.out.println("против " + opponent.name + " (здоровье: " + opponent.health + ")");
        System.out.println();

        int round = 1;

        while (myHero.isAlive() && opponent.isAlive()) {
            System.out.println("----- РАУНД " + round + " -----");

            // ОЖИДАНИЕ ВВОДА: теперь работает корректно
            System.out.println("Нажмите Enter для атаки " + myHero.name);
            scanner.nextLine();

            System.out.println("Ход: " + myHero.name);
            myHero.sayBeforeAttack();
            myHero.theStandardAttack(opponent);
            System.out.println();
            if (!opponent.isAlive()) {
                break;
            }

            System.out.println("Ход: " + opponent.name);
            opponent.sayBeforeAttack();
            opponent.theStandardAttack(myHero);
            System.out.println();
            if (!myHero.isAlive()) {
                break;
            }

            System.out.println("Состояние после раунда № " + round + ":");
            System.out.println(myHero.name + ": " + myHero.health);
            System.out.println(opponent.name + ": " + opponent.health);
            System.out.println("Нажмите Enter для продолжения...");
            scanner.nextLine(); // Ожидание перед следующим раундом

            round++;
        }

        // Определение победителя и проигравшего
        Hero winner, loser;
        if (myHero.isAlive()) {
            winner = myHero;
            loser = opponent;
        } else {
            winner = opponent;
            loser = myHero;
        }

        System.out.println(" ПОБЕДИТЕЛЬ: " + winner.name + "!");
        winner.wordsOfThreat();
        loser.theLossWords();
    }

    public static void printAllHeroes(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println((i + 1) + ". " + heroes[i].name + " " + heroes[i].clazz);
        }
    }
}