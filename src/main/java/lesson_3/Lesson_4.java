package lesson_3;

import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст");
        String inputSentence = scanner.nextLine();
        System.out.println("Вы ввели предложение: " + inputSentence);
        System.out.println();

        countWord(inputSentence);
        countingWords(inputSentence);
    }

    public static void countWord(String text) {
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Количество слов " + words.length);
    }

    public static void countingWords(String text) {
        String[] words = text.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println("Подсчет слов " + (i + 1) + ": " + words[i]);
        }
    }
}