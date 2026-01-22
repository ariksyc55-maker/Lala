package lesson_3;

import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Колиство элемнтов массива");
        int n = scanner.nextInt();
        int[] numbers = fillArray(scanner, n);

        comparingNumbers(numbers);

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
        int plus = 0;
        int minus = 0;
        int zero = 0;

        for (int num : numbers) {
            if (num > 0) {
                ++plus;
            } else if (num < 0) {
                ++minus;
            } else {

                ++zero;
            }
        }
        System.out.println("Положительные элементы: " + plus);
        System.out.println("Отрицательные элементы: " + minus);
        System.out.println("Раняется нулю: " + zero);
    }
}
