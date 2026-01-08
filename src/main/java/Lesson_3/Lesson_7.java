package Lesson_3;

public class Lesson_7 {
    public static void main(String[] args) {
        //создаем указаное предложение
        System.out.println("Hello    World! Hi Whooooooosh");
        String text = "Hello World! Hi Whooooooosh";
        System.out.println("Длина строки: " + text.length());
        //здесь задаем пробел разделителем слов
        String[] words = text.split(" ");
        //здесь создаем переменную (самое длинное слово)
        //в дальнейшем внесем сюда слово
        String longerWord = "";
        //перебираем слова
        for (String word : words) {
            if (word.length() > longerWord.length()) {
                longerWord = word;
            }
        }

        String smallerWord = "";
        for (String word : words) {
            if (word.length() < smallerWord.length()) {
                smallerWord = word;
            }
        }
        //вывод самого длинного слова
        System.out.println("Самое длинное слово: " + longerWord);
        System.out.println("Самое короткое слово: " + smallerWord);
    }
}