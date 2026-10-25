package practice8;

import java.util.Scanner;

public class num16 {
    public static void main(String[] args) {
        int[] result = new int[2];

        findMaxAndCount(result);

        System.out.println(result[1]);
    }

    public static void findMaxAndCount(int[] result) {
        Scanner scanner = new Scanner(System.in);

        int current = scanner.nextInt();
        result[0] = current; // Максимум
        result[1] = 1;       // Количество максимумов

        readSequence(scanner, result);

        scanner.close();
    }

    private static void readSequence(Scanner scanner, int[] result) {
        int current = scanner.nextInt();

        if (current == 0) {
            return;
        }

        if (current > result[0]) {
            result[0] = current;
            result[1] = 1;
        } else if (current == result[0]) {
            result[1]++;
        }

        readSequence(scanner, result);
    }
}