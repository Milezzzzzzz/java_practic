package practice8;

import java.util.Scanner;

public class var14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            printDigits(n);
        }

        scanner.close();
    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }

        printDigits(n / 10);

        System.out.print(n % 10 + " ");
    }
}