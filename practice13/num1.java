package practice13;

public class num1 {
    public static void main(String[] args) {
        String str = "I like Java!!!";

        System.out.println("2. Последний символ: " + str.charAt(str.length() - 1));

        System.out.println("3. Заканчивается на '!!!': " + str.endsWith("!!!"));

        System.out.println("4. Начинается с 'I like': " + str.startsWith("I like"));

        System.out.println("5. Содержит 'Java': " + str.contains("Java"));

        System.out.println("6. Позиция 'Java': " + str.indexOf("Java"));

        System.out.println("7. Замена 'а' на 'о': " + str.replace('а', 'о'));

        System.out.println("8. Верхний регистр: " + str.toUpperCase());

        System.out.println("9. Нижний регистр: " + str.toLowerCase());

        System.out.println("10. Вырезать 'Java': " + str.substring(str.indexOf("Java"), str.indexOf("Java") + 4));
    }
}