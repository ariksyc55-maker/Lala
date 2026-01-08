package Lesson_3;

import java.util.Scanner;

public class Lesson_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        String word1 = "привет";
        String replacement = "***";
        String regex = "(?i)\\b(" + word1 + ")\\b";
        System.out.println(text.replaceAll(regex, replacement));
        scanner.close();
    }
}
