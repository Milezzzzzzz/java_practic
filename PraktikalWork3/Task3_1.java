package PraktikalWork3;

import java.util.Scanner;

public class Task3_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Условные курсы
        double usdRate = 80.0;
        double eurRate = 95.0;

        System.out.print("Введите сумму в рублях: ");
        double rubles = scanner.nextDouble();

        System.out.println("Выберите валюту:");
        System.out.println("1 - Доллары США");
        System.out.println("2 - Евро");

        int choice = scanner.nextInt();

        double result;

        if (choice == 1) {

            result = rubles / usdRate;

            System.out.printf(
                    "%.2f RUB = %.2f USD%n",
                    rubles,
                    result
            );

        } else if (choice == 2) {

            result = rubles / eurRate;

            System.out.printf(
                    "%.2f RUB = %.2f EUR%n",
                    rubles,
                    result
            );

        } else {

            System.out.println("Неверный выбор валюты.");
        }

        scanner.close();
    }
}