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
        System.out.println("Введите число для удаления");
        int target = scanner.nextInt();
        int count = 0;
        for (int num : numbers) {
            if (num == target) count++;}
        int [] result = new int[n - count];
        int index = 0;
        for (int num : numbers) {
            if (num != target) {
                result[index] = num;
                index++; } }
                System.out.println("Итоговый массив: ");
                for (int num : result)
                    System.out.println(num + " ");
        }
    }
