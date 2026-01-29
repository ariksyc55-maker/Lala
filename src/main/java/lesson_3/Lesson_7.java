package lesson_3;

public class Lesson_7 {
    static String longerWord = "";
    static String smallerWord = "";

    public static void main(String[] args) {
        String inputSentence = "Hello World! Hi Whooooooosh";
        System.out.println("Текст: " + inputSentence);

        longerAndSmallerWord(inputSentence);
        lineOutput();
    }

    public static void longerAndSmallerWord(String text) {
        String[] words = text.trim().split(" ");

        if (words.length == 0) return;

        longerWord = words[0];
        smallerWord = words[0];

        for (String word : words) {
            if (word.length() > longerWord.length()) {
                longerWord = word;
            }
            if (word.length() < smallerWord.length()) {
                smallerWord = word;
            }
        }
    }

    public static void lineOutput() {
        System.out.println("Самое длинное слово: " + longerWord);
        System.out.println("Самое короткое слово: " + smallerWord);
    }
}

