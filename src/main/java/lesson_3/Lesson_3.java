package lesson_3;

import java.util.Scanner;

public class Lesson_3 {
    static Scanner scanner;

    public static void main(String[] args) {
        initScanner();

        System.out.println("Введите предложение: ");
        String inputSentence = scanner.nextLine();
        System.out.println("Вы ввели: " + inputSentence);
        System.out.println();

        // СОХРАНЯЕМ результат обработки в новую переменную
        String processedText = textDoNotMoreTenCharacters(inputSentence);

        // ПЕРЕДАЕМ обработанный результат в метод вывода
        lineOutput(processedText);
    }

    public static void initScanner(){
        scanner = new Scanner(System.in);
    }

    // ИСПРАВЛЕНО: заменили void на String
    public static String textDoNotMoreTenCharacters(String text) {
        if (text.length() > 10) {
            return text.substring(0, 10) + "...";
        } else {
            return text;
        }
    }

    public static void lineOutput(String finalResult){
        System.out.println("Обработанный текст:");
        System.out.println(finalResult);
    }
}
