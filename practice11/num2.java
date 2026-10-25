package practice11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        sdf.setLenient(false); // Строгая проверка даты

        System.out.println("Введите дату и время:");
        String input = scanner.nextLine();

        try {
            Date userDate = sdf.parse(input);
            Date currentDate = new Date();

            System.out.println("Дата: " + sdf.format(userDate));
            System.out.println("Текущая дата:   " + sdf.format(currentDate));

            int comparison = userDate.compareTo(currentDate);

            if (comparison > 0) {
                System.out.println("Введенная дата находится в БУДУЩЕМ.");
            } else if (comparison < 0) {
                System.out.println("Введенная дата находится в ПРОШЛОМ.");
            } else {
                System.out.println("Введенная дата сейчас");
            }

        } catch (ParseException e) {
            System.out.println("Неверный формат даты");
        } finally {
            scanner.close();
        }
    }
}