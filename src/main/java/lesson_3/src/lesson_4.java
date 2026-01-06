import java.util.Scanner;

public class lesson_4 {
    public static void main(String[] args) {
        //создаем строку вывода нашего текста
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        //создаю разделение по пробелам
        String[] words = text.split("");
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