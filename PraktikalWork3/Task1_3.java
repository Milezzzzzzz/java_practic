package PraktikalWork3;

import java.util.Arrays;
import java.util.Random;

public class Task1_3 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] array = new int[4];

        // Заполнение массива числами от 10 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(90) + 10;
        }

        System.out.println("Массив:");
        System.out.println(Arrays.toString(array));

        boolean increasing = true;

        // Проверяем строгое возрастание
        for (int i = 1; i < array.length; i++) {

            if (array[i] <= array[i - 1]) {
                increasing = false;
                break;
            }
        }

        if (increasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}