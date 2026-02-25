package lesson_4;

import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;
import lesson_4.hero.Warrior;

import java.util.Scanner;

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

        System.out.println("1. " + warriorOne.name + " (ВОИН)");
        System.out.println("2. " + warriorTwo.name + " (ВОИН)");
        System.out.println("3. " + mageOne.name + " (МАГ)");
        System.out.println("4. " + mageTwo.name + " (МАГ)");
        System.out.println("5. " + rogueOne.name + " (РАЗБОЙНИК)");
        System.out.println("6. " + rogueTwo.name + " (РАЗБОЙНИК)");

        System.out.println();
        System.out.println("Выберите героя для сражения: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        Hero myHero;

        if (choice >= 1 && choice <= 6) {
            switch (choice) {
                case 1:
                    myHero = warriorOne;
                    break;
                case 2:
                    myHero = warriorTwo;
                    break;
                case 3:
                    myHero = mageOne;
                    break;
                case 4:
                    myHero = mageTwo;
                    break;
                case 5:
                    myHero = rogueOne;
                    break;
                case 6:
                    myHero = rogueTwo;
                    break;
                default:
                    System.out.println("Неверный выбор! Выбран герой по умолчанию (Артур).");
                    myHero = warriorOne;
            }
            System.out.println("Вы выбрали: " + myHero.name);
            System.out.println();
        } else {
            System.out.println("Ошибка! Введите число от 1 до 6.");
            System.out.println();
            scanner.next();
        }

        System.out.println("1. " + warriorOne.name + " (ВОИН)");
        System.out.println("2. " + warriorTwo.name + " (ВОИН)");
        System.out.println("3. " + mageOne.name + " (МАГ)");
        System.out.println("4. " + mageTwo.name + " (МАГ)");
        System.out.println("5. " + rogueOne.name + " (РАЗБОЙНИК)");
        System.out.println("6. " + rogueTwo.name + " (РАЗБОЙНИК)");

        System.out.println();
        System.out.println("Выберите себе врага: ");

        int opponentChoice = scanner.nextInt();
        scanner.nextLine();

        Hero opponent;
        switch (opponentChoice) {
                case 1:
                    opponent = warriorOne;
                    break;
                case 2:
                    opponent = warriorTwo;
                    break;
                case 3:
                    opponent = mageOne;
                    break;
                case 4:
                    opponent = mageTwo;
                    break;
                case 5:
                    opponent = rogueOne;
                    break;
                case 6:
                    opponent = rogueTwo;
                    break;
            default:
                System.out.println("Неверный выбор! Выбран случайный противник (Фростморн).");
                opponent = warriorTwo;
        }
        System.out.println("Ваш противник: " + opponent.name);
        System.out.println();
        }

    }


