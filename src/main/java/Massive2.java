import java.util.Arrays;

public class Massive2 {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length / 2; i++){
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;}
        System.out.println("Инвертированный массив:" + Arrays.toString(numbers));
    }
    }