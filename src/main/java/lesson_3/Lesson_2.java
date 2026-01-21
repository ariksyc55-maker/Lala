package lesson_3;

import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем Scanner только один раз

        String inputSentence = readInput(scanner); // Вызываем метод для чтения ввода
        System.out.println("Введенный текст:");
        System.out.println(inputSentence);
        System.out.println(); // Пустая строка для разделения вывода

        // Вызываем методы для выполнения каждой из задач
        KolichestvoSimvolov(inputSentence);
        FirstAndLastCharacter(inputSentence);
        SimvolNovoqStroki(inputSentence);

        scanner.close(); // Закрываем Scanner в конце
    }

    private static String readInput(Scanner scanner) {
        System.out.println("Введите предложение");
        return scanner.nextLine();
    }


    private static void KolichestvoSimvolov(String sentence) {
        System.out.print("Количество символов: ");
        System.out.println(sentence.length());
        System.out.println(); // Пустая строка для разделения вывода
    }


    private static void FirstAndLastCharacter(String sentence) {
        char first = sentence.charAt(0);
        char last = sentence.charAt(sentence.length() - 1);
        System.out.println("Первый символ: " + first);
        System.out.println("Последний символ: " + last);

    }

    private static void SimvolNovoqStroki(String sentence) {
        System.out.println("Каждый символ с новой строки: ");
        for (int i = 0; i < sentence.length(); i++) {
            System.out.println(sentence.charAt(i));
        }
    }
}
