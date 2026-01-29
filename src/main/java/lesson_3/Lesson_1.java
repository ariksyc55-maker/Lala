package lesson_3;

import java.util.Scanner;

public class Lesson_1 {
    static int plus = 0;
    static int minus = 0;
    static int zero = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем Scanner только один раз

        System.out.println("Количество элементов массива: ");
        int n = scanner.nextInt();
        int[] numbers = fillArray(scanner, n);

        comparingNumbers(numbers);
        lineOutput(numbers);

    }

    private static String readInput(Scanner scanner) {
        System.out.println("Введите предложение");
        return scanner.nextLine();
    }

    public static int[] fillArray(Scanner scanner, int size) {
        int[] array = new int[size];
        System.out.println("Введите " + size + " чисел");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;

    }

    public static void comparingNumbers(int[] numbers) {


        for (int num : numbers) {
            if (num > 0) {
                ++plus;
            } else if (num < 0) {
                ++minus;
            } else {

                ++zero;
            }
        }
    }

    public static void lineOutput(int[] numbers) {
        System.out.println("Положительные элементы: " + plus);
        System.out.println("Отрицательные элементы: " + minus);
        System.out.println("Раняется нулю: " + zero);
    }
}
