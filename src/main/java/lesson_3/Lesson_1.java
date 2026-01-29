package lesson_3;

import java.util.Scanner;

public class Lesson_1 {
    static Scanner scanner;

    static int plus = 0;
    static int minus = 0;
    static int zero = 0;

    public static void main(String[] args) {
        initScanner();

        System.out.println("Количество элементов массива: ");
        int n = scanner.nextInt();


        int[] numbers = fillArray(n);

        comparingNumbers(numbers);
        lineOutput();
    }


    public static void initScanner() {
        scanner = new Scanner(System.in);
    }

    private static String readInput() {
        System.out.println("Введите предложение:");
        scanner.nextLine();
        return scanner.nextLine();
    }

    public static int[] fillArray(int size) {
        int[] array = new int[size];
        System.out.println("Введите " + size + " чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void comparingNumbers(int[] numbers) {
        plus = 0; minus = 0; zero = 0;

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

    public static void lineOutput() {
        System.out.println("Положительные элементы: " + plus);
        System.out.println("Отрицательные элементы: " + minus);
        System.out.println("Равняется нулю: " + zero);
    }
}

