package lesson_4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import lesson_4.Potion;
import lesson_4.PotionType;
import lesson_4.hero.Warrior;
import lesson_4.hero.Mage;
import lesson_4.hero.Rogue;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- ДОБРО ПОЖАЛОВАТЬ В ИГРУ -----");
        System.out.println();

        Warrior warriorOne = new Warrior("Артур", 200, 30);
        warriorOne.addPotion(PotionType.HEALING,2);
        Warrior warriorTwo = new Warrior("Фростморн", 190, 40);
        warriorTwo.addPotion(PotionType.HEALING, 2);
        Mage mageOne = new Mage("Ягерместер", 130, 20);
        mageOne.addPotion(PotionType.HEALING, 2);
        Mage mageTwo = new Mage("Ильестр", 140, 30);
        mageTwo.addPotion(PotionType.HEALING, 2);
        Rogue rogueOne = new Rogue("Берсек", 150, 50);
        rogueOne.addPotion(PotionType.HEALING, 2);
        Rogue rogueTwo = new Rogue("Брианна", 170, 40);
        rogueTwo.addPotion(PotionType.HEALING, 2);

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
            // убрать 2 атаку после окончания снарядов
            if (myHero.getUsedStrongestAttacks() < myHero.maxStrongestAttacks) {
                System.out.println("2 - Сильнейшая атака (осталось: " + (myHero.getAvailableStrongAttacks()) + ")");
            } else {
                System.out.println("2 - Сильнейшая атака больше не доступна (заряды закончились)");
            }
            System.out.println("3 - Использовать зелье восстановления");

            int attackChoice = 0;
            while (attackChoice != 1 && attackChoice != 2 && attackChoice != 3) {
                System.out.print("Ваш выбор: ");
                attackChoice = scanner.nextInt();
                scanner.nextLine();
            }

            switch (attackChoice) {
                case 1:
                    System.out.println(myHero.name + " - Использовал стандартную атаку");
                    myHero.performStandardAttack(opponent);
                    break;
                case 2:
                    if (myHero.getUsedStrongestAttacks() < myHero.maxStrongestAttacks) {
                        System.out.println(myHero.name + " - Использовал сильнейшую атаку");
                        myHero.performStrongestAttack(opponent);
                    } else {
                        System.out.println("Заряды сильнейшей атаки закончились. Выполняется стандартная атака.");
                        myHero.performStandardAttack(opponent);
                    }
                    break;
                case 3:
                    myHero.useHealingPotion();
                    break;
            }


            if (!opponent.isAlive()) {
                break;
            }

            System.out.println("Ход: " + opponent.name);
            System.out.println("1 - Обычная атака");
            if (opponent.getUsedStrongestAttacks() < opponent.maxStrongestAttacks) {
                System.out.println("2 - Сильнейшая атака (осталось: " + (opponent.getAvailableStrongAttacks()) + ")");
            } else {
                System.out.println("2 - Сильнейшая атака больше не доступна (заряды закончились)");
            }
            System.out.println("3 - Использовать зелье восстановления");

            attackChoice = 0;
            while (attackChoice != 1 && attackChoice != 2 && attackChoice != 3) {
                System.out.print("Ваш выбор: ");
                attackChoice = scanner.nextInt();
                scanner.nextLine();
            }

            switch (attackChoice) {
                case 1:
                    System.out.println(opponent.name + " - Использовал стандартную атаку");
                    opponent.performStandardAttack(myHero);
                    break;
                case 2:
                    if (opponent.getUsedStrongestAttacks() < myHero.maxStrongestAttacks) {
                        System.out.println(opponent.name + " - Использовал сильнейшую атаку");
                        opponent.performStrongestAttack(myHero);
                    } else {
                        System.out.println("Заряды сильнейшей атаки закончились. Выполняется стандартная атака.");
                        opponent.performStandardAttack(myHero);
                    }
                    break;
                case 3:
                    opponent.useHealingPotion();
                    break;
            }


            if (!opponent.isAlive()) {
                break;
            }
            if (!myHero.isAlive()) {
                break;
            }

            System.out.println("Состояние после раунда № " + round + ":");
            System.out.println(myHero.name + ": " + myHero.health);
            System.out.println(opponent.name + ": " + opponent.health);
            int myHeroPotionCount = 0;
            for (Potion potion : myHero.potionList) {
                myHeroPotionCount += potion.getQuantity();
            }
            System.out.println("Зелья восстановления у " + myHero.name + ": " + myHeroPotionCount);

            int opponentPotionCount = 0;
            for (Potion potion : opponent.potionList) {
                if (potion.getType() == PotionType.HEALING){
                    opponentPotionCount += potion.getQuantity();
                }
            }
            System.out.println("Зелья восстановления у " + opponent.name + ": " + opponentPotionCount);
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
            int healingPotionsCount = 0;
            for (Potion potion : hero.potionList) {
                if (potion.getType() == PotionType.HEALING) {
                    healingPotionsCount += potion.getQuantity();
                }
            }
                System.out.println(index + ". " + hero.name + " (" + hero.clazz + ")");
                System.out.println("   Здоровье: " + hero.health + ", Сила: " + hero.power);
                System.out.println("   Зелья восстановления: " + healingPotionsCount);
                index++;

        }
    }
}