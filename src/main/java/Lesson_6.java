import java.util.Scanner;

public class Lesson_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scanner.nextLine();
        System.out.println(text.replace("Привет", "***"));
        System.out.println(text.replace("привет", "***"));
    }
}
