import java.util.Scanner;

public class lesson_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int plus = 0;
        int minus = 0;
        int zero = 0;

        for (int num : numbers) {
            if (num > 0) {
                plus++;
            } else if (num < 0) {
                minus++;
            } else if (num == 0) {
                zero++;
            }
        }
        System.out.println("Положительные элеиенты:" + plus);
        System.out.println("Отрицательные элементы:" + minus);
        System.out.println("Раняется нули:" + zero);
    }
}