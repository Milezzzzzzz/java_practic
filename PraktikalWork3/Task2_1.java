package PraktikalWork3;

public class Task2_1 {

    public static void main(String[] args) {

        // 1. Создание объекта Double с помощью valueOf()
        Double number = Double.valueOf(3.14);

        System.out.println("Объект Double: " + number);

        // 2. Преобразование String в double
        String str = "25.75";

        double parsedNumber = Double.parseDouble(str);

        System.out.println("String -> double: " + parsedNumber);

        // 3. Преобразование Double во все примитивные числовые типы

        byte byteValue = number.byteValue();
        short shortValue = number.shortValue();
        int intValue = number.intValue();
        long longValue = number.longValue();
        float floatValue = number.floatValue();
        double doubleValue = number.doubleValue();

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        // 4. Вывод объекта Double
        System.out.println("Значение Double: " + number);

        // 5. double -> String
        String d = Double.toString(3.14);

        System.out.println("double -> String: " + d);
    }
}