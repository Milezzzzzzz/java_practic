package PraktikalWork2;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова через пробел:");

        String input = scanner.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("Количество слов: 0");
            return;
        }

        String[] words = input.trim().split("\\s+");

        System.out.println("Количество слов: " + words.length);

        scanner.close();
    }
}