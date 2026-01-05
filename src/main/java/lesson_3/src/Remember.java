public class Remember {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");
        System.out.println(s1 == s2); // false (разные объекты)
        System.out.println(s1.equals(s2)); // true (содержимое одинаковое)
    }
}
