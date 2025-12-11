import java.util.Scanner;

public class Massive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println("Вы ввели массив");
            System.out.println(numbers[i] + "");
        }
    }

}