package practice14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class num4 {
    public static void main(String[] args) {
        // \d — любая цифра
        // (?!\+) — проверяет, что сразу после цифры нет +
        String regex = "\\d(?!\\+)";

        String[] tests = {
                "(1 + 8) – 9 / 4",
                "6 / 5 – 2 * 9"
        };

        Pattern pattern = Pattern.compile(regex);

        for (String test : tests) {
            Matcher matcher = pattern.matcher(test);
            boolean found = matcher.find();
            System.out.println("Текст: \"" + test + "\"");
            System.out.println("Цифра без +: " + found);

            if (found) {
                System.out.print("Найденные цифры: ");
                matcher.reset();
                while (matcher.find()) {
                    System.out.print(matcher.group() + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}