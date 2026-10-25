package practice11;

import java.util.Date;

public class num1 {
    public static void main(String[] args) {
        String developerLastName = "Мальчевский";


        @SuppressWarnings("deprecation")
        Date taskReceived = new Date(2023 - 1900, 9, 15, 10, 0, 0);

        Date taskSubmitted = new Date();

        System.out.println("Фамилия: " + developerLastName);
        System.out.println("Дата и время получения задания: " + taskReceived);
        System.out.println("Дата и время сдачи задания: " + taskSubmitted);


    }
}