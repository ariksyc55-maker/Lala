package lesson_3;

public class Remember {
    public static void main(String[] args) {

        System.out.println("Пример №1");


        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2);   // false (разные объекты)
        System.out.println(s1.equals(s2));  // true (содержимое одинаковое)

        System.out.println(); //красная строка

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println(a == b);       // true (один объект из пула)
        System.out.println(a == c);       // false (новый объект)
        System.out.println(a.equals(c));  // true (текст одинаковый)


        System.out.println(); //красная строка

        System.out.println("Пример №2");

        String text = " Привет, Ярослав! ";
        System.out.println(text.length());  // длина строки
        System.out.println(text.trim());    // убираем пробелы
        System.out.println(text.charAt(2)); // символ на позиции 2
        System.out.println(text.substring(0, 6));   // "Привет" - слова в обозначенной позиции
        System.out.println(text.replace("Ярослав", "друг"));    // замена слова
    }
}
