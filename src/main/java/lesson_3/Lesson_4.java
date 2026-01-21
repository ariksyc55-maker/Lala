package lesson_3;

import java.util.Scanner;

public class Lesson_4 {
    public static void main(String[] args) {
        //создаем строку вывода нашего текста
        Scanner scanner = new Scanner(System.in);
        String inputSenter = readInput(scanner);
        System.out.println(inputSenter);
        System.out.println();

        TextProbel(inputSenter);
        SchetSlov(inputSenter);

        //создаю разделение по пробелам
        private static String readInput(Scanner scanner) {
        }

        private static void T
        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Количество слов " + words.length);
        //веду посчет слов
        for (int i = 0; i < words.length; i++) {
            System.out.println("Подсчет слов " + (i + 1) + ": " + words[i]);
        }
    }
}