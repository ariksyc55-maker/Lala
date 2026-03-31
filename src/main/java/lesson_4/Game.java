package lesson_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;
import lesson_4.hero.Warrior;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- ДОБРО ПОЖАЛОВАТЬ В ИГРУ -----");
        System.out.println();

        Warrior warriorOne = new Warrior("Артур", 200, 30);
        Warrior warriorTwo = new Warrior("Фростморн", 190, 40);
        Mage mageOne = new Mage("Ягерместер", 130, 20);
        Mage mageTwo = new Mage("Ильестр", 140, 30);
        Rogue rogueOne = new Rogue("Берсек", 150, 50);
        Rogue rogueTwo = new Rogue("Брианна", 170, 40);

        List<Hero> heroes = new ArrayList<>();
        heroes.add(mageOne);
        heroes.add(mageTwo);
        heroes.add(warriorOne);
        heroes.add(warriorTwo);
        heroes.add(rogueOne);
        heroes.add(rogueTwo);

        int choice = 0;
        while (choice < 1 || choice > heroes.size()) {
            System.out.println("Выберите героя для сражения: ");
            printAllHeroes(heroes);
            System.out.println();
            choice = scanner.nextInt();
            scanner.nextLine();
        }
        int firstHeroIndex = choice - 1;
        Hero firstHero = heroes.get(firstHeroIndex);
        System.out.println("Вы выбрали: " + firstHero.name);
        System.out.println();

        choice = 0;
        while (choice < 1 || choice > heroes.size() || choice - 1 == firstHeroIndex) {
            System.out.println("Выберите себе врага: ");
            printAllHeroes(heroes);
            System.out.println();
            choice = scanner.nextInt();
            scanner.nextLine();
        }
        Hero opponent = heroes.get(choice - 1);
        System.out.println("Ваш противник: " + opponent.name);
        System.out.println();
        attack(firstHero, opponent, scanner);
        scanner.close();
    }

    public static void attack(Hero myHero, Hero opponent, Scanner scanner) {
        System.out.println("-----БИТВА НАЧИНАЕТСЯ-----");
        System.out.println("Сражаются: " + myHero.name + " (здоровье: " + myHero.health + ")");
        System.out.println("против ");
        System.out.println(opponent.name + " (здоровье: " + opponent.health + ")");
        System.out.println();

        int round = 1;

        System.out.println("Нажмите Enter для начала боя...");
        scanner.nextLine();

        while (myHero.isAlive() && opponent.isAlive()) {
            System.out.println("----- РАУНД " + round + " -----");
            System.out.println("Нажмите Enter для атаки " + myHero.name);
            scanner.nextLine();

            System.out.println("Ход: " + myHero.name);
            System.out.println("1 - Обычная атака");
            if (myHero.usedStrongestAttacks < myHero.maxStrongestAttacks) {
                System.out.println("2 - Сильнейшая атака (осталось: " + (myHero.getAvailableStrongAttacks()) + ")");
            } else {
                System.out.println("2 - Сильнейшая атака больше не доступна (заряды закончились)");
            }

            int attackChoice = 0;
            while (attackChoice != 1 && attackChoice != 2) {
                System.out.print("Ваш выбор: ");
                attackChoice = scanner.nextInt();
                scanner.nextLine();
            }

            if (attackChoice == 1) {
                System.out.println(myHero.name + " - Использовал стандартную атаку");
                myHero.performStandardAttack(opponent);
            } else {
                if (myHero.usedStrongestAttacks < myHero.maxStrongestAttacks) {
                    System.out.println(myHero.name + " - Использовал сильнейшую атаку");
                    myHero.performStrongestAttack(opponent);
                } else {
                    System.out.println("Невозможно выполнить сильнейшую атаку! Заряды закончились.");
                }
            }
            myHero.announceAttack();
            System.out.println();

            if (!opponent.isAlive()) {
                break;
            }

            System.out.println("Ход: " + opponent.name);
            System.out.println("1 - Обычная атака");
            if (opponent.usedStrongestAttacks < opponent.maxStrongestAttacks) {
                System.out.println("2 - Сильнейшая атака (осталось: " + (opponent.getAvailableStrongAttacks()) + ")");
            } else {
                System.out.println("Сильнейшая атака больше не доступна (заряды закончились)");
            }

            attackChoice = 0;
            while (attackChoice != 1 && attackChoice != 2) {
                System.out.print("Ваш выбор : ");
                attackChoice = scanner.nextInt();
                scanner.nextLine();
            }

            if (attackChoice == 1) {
                System.out.println(opponent.name + " - Использовал стандартную атаку");
                opponent.performStandardAttack(myHero);
            } else {
                if (opponent.usedStrongestAttacks < opponent.maxStrongestAttacks) {
                    System.out.println(opponent.name + " - Использовал сильнейшую атаку");
                    opponent.performStrongestAttack(myHero);
                } else {
                    System.out.println("Невозможно выполнить сильнейшую атаку! Заряды закончились.");
                }
            }
            opponent.announceAttack();
            System.out.println();

            if (!opponent.isAlive()) {
                break;
            }

            System.out.println("Состояние после раунда № " + round + ":");
            System.out.println(myHero.name + ": " + myHero.health);
            System.out.println(opponent.name + ": " + opponent.health);
            System.out.println("Нажмите Enter для продолжения...");
            scanner.nextLine();

            round++;
        }

        Hero winner, loser;
        if (myHero.isAlive()) {
            winner = myHero;
            loser = opponent;
        } else {
            winner = opponent;
            loser = myHero;
        }

        System.out.println(" ПОБЕДИТЕЛЬ: " + winner.name + "!");
        winner.declareVictory();
        loser.reactToDefeat();
    }

    public static void printAllHeroes(List<Hero> heroes) {
        int index = 1;
        for (Hero hero : heroes) {
            System.out.println(index + ". " + hero.name + " (" + hero.clazz + ")");
            index++;
        }
    }
}