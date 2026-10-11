package PraktikalWork2;

import java.util.*;

public class Task9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество игроков: ");
        int n = scanner.nextInt();

        if (n <= 0 || n * 5 > 52) {
            System.out.println(
                    "Ошибка: количество игроков должно быть от 1 до 10."
            );
            return;
        }

        String[] suits = {
                "♠", "♥", "♦", "♣"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6", "7", "8",
                "9", "10", "J", "Q", "K", "A"
        };

        ArrayList<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.add(rank + suit);
            }
        }

        Collections.shuffle(deck);

        int index = 0;

        for (int player = 1; player <= n; player++) {

            System.out.println("Игрок " + player + ":");

            for (int card = 0; card < 5; card++) {
                System.out.println(deck.get(index));
                index++;
            }

            System.out.println();
        }

        scanner.close();
    }
}