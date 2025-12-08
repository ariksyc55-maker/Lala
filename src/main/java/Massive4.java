import java.util.Scanner;

public class Massive4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();}
        for (int i = 0; i < numbers.length / 2; i++);
        int mix = numbers[0];
        for (int i = 1; i > n; i++) {
            if (numbers[i] < mix) {
                mix = numbers[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + mix);


    }
}