package Lesson_3;

import java.util.Scanner;

public class Lesson_2 {
    public static void main(String[] args) {
        //создаю ввод текста
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String word = scanner.nextLine();
        System.out.println("Введенный текст:");
        System.out.println(word);
        System.out.println();

        /*начинаю создавть согласно плану
        1.Длина строки;
        2.Первый и последний символ;
        3.Каждый символ с новой строки*/

        //1
        System.out.print("Количество символов: ");
        System.out.println(word.length());
        System.out.println();

        //2
        char first = word.charAt(0);
        char last = word.charAt(word.length() - 1);
        System.out.println("Первый символ: " + first);
        System.out.println("Последний символ: " + last);
        System.out.println();

        //3
        System.out.println("Каждый символ с новой строки: ");
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}