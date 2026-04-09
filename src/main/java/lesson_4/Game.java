package lesson_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import lesson_4.hero.Warrior;
import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- ДОБРО ПОЖАЛОВАТЬ В ИГРУ -----");
        System.out.println();

        Warrior warriorOne = new Warrior("Артур", 240, 32);
        warriorOne.addPotion(PotionType.HEALING, 2);
        warriorOne.addPotion(PotionType.STRONGEST_ATTACK, 2);
        Warrior warriorTwo = new Warrior("Фростморн", 250, 30);
        warriorTwo.addPotion(PotionType.HEALING, 2);
        warriorTwo.addPotion(PotionType.STRONGEST_ATTACK, 2);
        Mage mageOne = new Mage("Ягерместер", 150, 48);
        mageOne.addPotion(PotionType.HEALING, 2);
        mageOne.addPotion(PotionType.STRONGEST_ATTACK, 2);
        Mage mageTwo = new Mage("Ильестр", 145, 50);
        mageTwo.addPotion(PotionType.HEALING, 2);
        mageTwo.addPotion(PotionType.STRONGEST_ATTACK, 2);
        Rogue rogueOne = new Rogue("Берсек", 180, 42);
        rogueOne.addPotion(PotionType.HEALING, 2);
        rogueOne.addPotion(PotionType.STRONGEST_ATTACK, 2);
        Rogue rogueTwo = new Rogue("Брианна", 175, 44);
        rogueTwo.addPotion(PotionType.HEALING, 2);
        rogueTwo.addPotion(PotionType.STRONGEST_ATTACK, 2);

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
        System.out.println("Вы выбрали: " + firstHero.getName());
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
        System.out.println("Ваш противник: " + opponent.getName());
        System.out.println();
        attack(firstHero, opponent, scanner);
        scanner.close();
    }

    public static void attack(Hero myHero, Hero opponent, Scanner scanner) {
        System.out.println("-----БИТВА НАЧИНАЕТСЯ-----");
        System.out.println("Сражаются: " + myHero.getName() + " (здоровье: " + myHero.getHealth() + ")");
        System.out.println("против ");
        System.out.println(opponent.getName() + " (здоровье: " + opponent.getHealth() + ")");
        System.out.println();

        int round = 1;

        System.out.println("Нажмите Enter для начала боя...");
        scanner.nextLine();

        while (myHero.isAlive() && opponent.isAlive()) {
            System.out.println("----- РАУНД " + round + " -----");
            System.out.println("Нажмите Enter для атаки " + myHero.getName());
            scanner.nextLine();

            System.out.println("Ход: " + myHero.getName());
            System.out.println("1 - Обычная атака");
            if (myHero.getUsedStrongestAttacks() < myHero.getMaxStrongestAttacks()) {
                System.out.println("2 - Сильнейшая атака (осталось: " + (myHero.getAvailableStrongAttacks()) + ")");
            } else {
                System.out.println("2 - Сильнейшая атака больше не доступна (заряды закончились)");
            }
            System.out.println("3 - Использовать зелье восстановления");
            System.out.println("4 - Использовать зелье восстановления сильнейших атак");

            int attackChoice = 0;
            while (attackChoice != 1 && attackChoice != 2 && attackChoice != 3 && attackChoice != 4) {
                System.out.print("Ваш выбор: ");
                attackChoice = scanner.nextInt();
                scanner.nextLine();
            }

            switch (attackChoice) {
                case 1:
                    System.out.println(myHero.getName() + " - Использовал стандартную атаку");
                    myHero.performStandardAttack(opponent);
                    break;
                case 2:
                    if (myHero.getUsedStrongestAttacks() < myHero.getMaxStrongestAttacks()) {
                        System.out.println(myHero.getName() + " - Использовал сильнейшую атаку");
                        myHero.performStrongestAttack(opponent);
                    } else {
                        System.out.println("Заряды сильнейшей атаки закончились. Выполняется стандартная атака.");
                        myHero.performStandardAttack(opponent);
                    }
                    break;
                case 3:
                    myHero.usePotion(PotionType.HEALING);
                    break;
                case 4:
                    myHero.usePotion(PotionType.STRONGEST_ATTACK);
                    break;
            }


            if (!opponent.isAlive()) {
                break;
            }

            System.out.println(); // пробел между строками атаки

            System.out.println("Ход: " + opponent.getName());
            System.out.println("1 - Обычная атака");
            if (opponent.getUsedStrongestAttacks() < opponent.getMaxStrongestAttacks()) {
                System.out.println("2 - Сильнейшая атака (осталось: " + (opponent.getAvailableStrongAttacks()) + ")");
            } else {
                System.out.println("2 - Сильнейшая атака больше не доступна (заряды закончились)");
            }
            System.out.println("3 - Использовать зелье восстановления");

            attackChoice = 0;
            while (attackChoice != 1 && attackChoice != 2 && attackChoice != 3 && attackChoice != 4) {
                System.out.print("Ваш выбор: ");
                attackChoice = scanner.nextInt();
                scanner.nextLine();
            }

            switch (attackChoice) {
                case 1:
                    System.out.println(opponent.getName() + " - Использовал стандартную атаку");
                    opponent.performStandardAttack(myHero);
                    break;
                case 2:
                    if (opponent.getUsedStrongestAttacks() < myHero.getMaxStrongestAttacks()) {
                        System.out.println(opponent.getName() + " - Использовал сильнейшую атаку");
                        opponent.performStrongestAttack(myHero);
                    } else {
                        System.out.println("Заряды сильнейшей атаки закончились. Выполняется стандартная атака.");
                        opponent.performStandardAttack(myHero);
                    }
                    break;
                case 3:
                    opponent.usePotion(PotionType.HEALING);
                    break;
                case 4:
                    opponent.usePotion(PotionType.STRONGEST_ATTACK);
            }


            if (!opponent.isAlive()) {
                break;
            }
            if (!myHero.isAlive()) {
                break;
            }

            System.out.println(); // пробел между строками атаки

            System.out.println("Состояние после раунда № " + round + ":");
            System.out.println(myHero.getName() + ": " + myHero.getHealth());
            System.out.println(opponent.getName() + ": " + opponent.getHealth());
            int myHeroPotionCount = 0;
            for (Potion potion : myHero.getPotionList()) {
                myHeroPotionCount += potion.getQuantity();
            }
            System.out.println("Зелья восстановления у " + myHero.getName() + ": " + myHeroPotionCount);

            int opponentPotionCount = 0;
            for (Potion potion : opponent.getPotionList()) {
                if (potion.getType() == PotionType.HEALING) {
                    opponentPotionCount += potion.getQuantity();
                }
            }
            System.out.println("Зелья восстановления у " + opponent.getName() + ": " + opponentPotionCount);
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

        System.out.println(" ПОБЕДИТЕЛЬ: " + winner.getName() + "!");
        winner.declareVictory();
        loser.reactToDefeat();
    }

    public static void printAllHeroes(List<Hero> heroes) {
        int index = 1;
        for (Hero hero : heroes) {
            int healingPotionsCount = 0;
            for (Potion potion : hero.getPotionList()) {
                if (potion.getType() == PotionType.HEALING) {
                    healingPotionsCount += potion.getQuantity();
                }
            }
            System.out.println(index + ". " + hero.getName() + " (" + hero.getClazz() + ")");
            System.out.println("   Здоровье: " + hero.getHealth() + ", Сила: " + hero.getPower());
            System.out.println("   Зелья восстановления: " + healingPotionsCount);
            System.out.println("   Зелья восстановление атак: " + healingPotionsCount);
            index++;
        }
    }
}