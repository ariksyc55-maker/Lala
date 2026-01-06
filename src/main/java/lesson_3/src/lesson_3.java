import java.util.Scanner;

public class lesson_3 {
    public static void main(String[] args) {
        //создаем строку вывода нашего текста
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите предложение: ");
            String text = scanner.nextLine();
        /*задаем два условия
        1. Первое проверяет сколько у нас значений,
        если больше 10, то все что после 10 заменяется на ...
        2. Если меньше то просто оставляет текст
        */
            if (text.length() > 10) {
            System.out.print(text.substring(0, 10));
            System.out.println("...");
        } else {
                System.out.println(text);

            }
        }
    }