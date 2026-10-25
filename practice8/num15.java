package practice8;

import java.util.Scanner;

public class num15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            printDigitsReverse(n);
        }

        scanner.close();
    }

    public static void printDigitsReverse(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n % 10 + " ");


        printDigitsReverse(n / 10);
    }
}