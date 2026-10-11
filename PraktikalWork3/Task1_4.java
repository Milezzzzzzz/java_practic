package PraktikalWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n;

        // Проверка ввода
        while (true) {

            System.out.print("Введите натуральное число n > 0: ");

            if (scanner.hasNextInt()) {

                n = scanner.nextInt();

                if (n > 0) {
                    break;
                }
            } else {
                scanner.next();
            }

            System.out.println("Ошибка! Введите натуральное число больше 0.");
        }

        // Создание первого массива
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1);
        }

        System.out.println("Первый массив:");
        System.out.println(Arrays.toString(array));

        // Сначала считаем количество четных элементов
        int countEven = 0;

        for (int value : array) {

            if (value % 2 == 0) {
                countEven++;
            }
        }

        // Создаём второй массив
        int[] evenArray = new int[countEven];

        int index = 0;

        for (int value : array) {

            if (value % 2 == 0) {
                evenArray[index] = value;
                index++;
            }
        }

        System.out.println("Массив четных элементов:");

        if (evenArray.length == 0) {
            System.out.println("Четных элементов нет.");
        } else {
            System.out.println(Arrays.toString(evenArray));
        }

        scanner.close();
    }
}