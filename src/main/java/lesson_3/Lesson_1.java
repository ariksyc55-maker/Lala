package lesson_3;

import java.util.Scanner;

public class Lesson_1 {
    // 1. Объявляем сканер как статическое поле класса
    static Scanner scanner;

    static int plus = 0;
    static int minus = 0;
    static int zero = 0;

    public static void main(String[] args) {
        // 2. Инициализируем сканер через метод
        initScanner();

        System.out.println("Количество элементов массива: ");
        int n = scanner.nextInt();

        // Теперь не нужно передавать scanner в параметры метода
        int[] numbers = fillArray(n);

        comparingNumbers(numbers);
        lineOutput();
    }

    // 3. Отдельный метод для инициализации сканера
    public static void initScanner() {
        scanner = new Scanner(System.in);
    }

    // Метод для чтения текста (если понадобится)
    private static String readInput() {
        System.out.println("Введите предложение:");
        // Поглощаем остаток строки после nextInt(), чтобы nextLine() работал корректно
        scanner.nextLine();
        return scanner.nextLine();
    }

    // Убрали Scanner из параметров, так как он теперь виден всему классу
    public static int[] fillArray(int size) {
        int[] array = new int[size];
        System.out.println("Введите " + size + " чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void comparingNumbers(int[] numbers) {
        // Сбрасываем счетчики перед расчетом
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

    // Убрали (int[] numbers), так как метод их не использует
    public static void lineOutput() {
        System.out.println("Положительные элементы: " + plus);
        System.out.println("Отрицательные элементы: " + minus);
        System.out.println("Равняется нулю: " + zero);
    }
}

