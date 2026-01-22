package lesson_3;

import java.util.Scanner;

public class Lesson_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите предложение: ");
        String inputSentence = scanner.nextLine();
        System.out.println("Вы ввели: " + inputSentence);
        System.out.println();

        textDoNotMoreTenCharacters(inputSentence);
    }

    public static void textDoNotMoreTenCharacters(String text) {
        if (text.length() > 10) {
            System.out.print(text.substring(0, 10));
            System.out.println("...");
        } else {
            System.out.println(text);
        }

    }
}