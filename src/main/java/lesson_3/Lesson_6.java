package lesson_3;

import java.util.Scanner;

public class Lesson_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String inputSentence = scanner.nextLine();
        System.out.println("Вы ввели: " + inputSentence);

        badWord(inputSentence);
    }

    public static void badWord(String text) {
        System.out.println(text.replaceAll("привет", "***"));
    }
}