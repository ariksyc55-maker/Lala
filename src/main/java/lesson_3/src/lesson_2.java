import java.util.Scanner;

public class lesson_2 {
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
        String text = word;
        System.out.print("Количество символов: ");
        System.out.println(text.length());

        //2
        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);
        System.out.println("Первый символ: " + first);
        System.out.println("Последний символ: " + last);

        //3
        System.out.println("Каждый символ с новой строки: ");
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i)); }
    }
}