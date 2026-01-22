package lesson_3;

public class Lesson_7 {
    public static void main(String[] args) {
        System.out.println("Hello    World! Hi Whooooooosh");
        String inputSentence = "Hello World! Hi Whooooooosh";

        longerAndSmallerWord(inputSentence);
    }
    public static void longerAndSmallerWord(String text) {
        System.out.println("Длина строки: " + text.length());
        String[] words = text.split(" ");
        String longerWord = "";
        String smallerWord = words[0];

        for(String word : words) {
            if (word.length() > longerWord.length()) {
                longerWord = word;
                if (word.length() < smallerWord.length()) {
                    smallerWord = word;
                }
            }
        }

        System.out.println("Самое длинное слово: " + longerWord);
        System.out.println("Самое короткое слово: " + smallerWord);
    }
}