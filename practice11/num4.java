package practice11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год, месяц и число:");
        int year = scanner.nextInt();
        int month = scanner.nextInt() - 1;
        int day = scanner.nextInt();

        System.out.println("Введите часы и минуты");
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();


        @SuppressWarnings("deprecation")
        Date date = new Date(year - 1900, month, day, hours, minutes);
        System.out.println("\nОбъект Date:");
        System.out.println(date);


        Calendar calendar = Calendar.getInstance();

        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);

        Date dateFromCalendar = calendar.getTime();

        System.out.println("\nОбъект Calendar:");
        System.out.println(dateFromCalendar);

        scanner.close();
    }
}