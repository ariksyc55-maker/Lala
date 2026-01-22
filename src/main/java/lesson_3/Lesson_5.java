package lesson_3;

public class Lesson_5 {
    public static void main(String[] args) {
        System.out.println("Текст с пробелами:");
        String inputSentence = " Java developer ";
        System.out.println(inputSentence);

        textNotSpace(inputSentence);
    }

    public static void textNotSpace(String text) {
        System.out.println("Текст без пробелов:");
        System.out.println(text.trim());
    }
}
