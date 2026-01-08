package Lesson_3;

import java.util.Scanner;

public class Lesson_1 {
    public static void main(String[] args) {

        //создаю массив и его длинну

        Scanner scanner = new Scanner(System.in);
        System.out.println("Количество элементов массива");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Введите " + n + " чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        //начальные переменные для сравнения

        int plus = 0;
        int minus = 0;
        int zero = 0;

        //сравниваю переменные с 0 и отношу их к своим таблицам

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
        System.out.println("Раняется нулю:" + zero);
    }
}