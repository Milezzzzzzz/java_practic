package practice14;

import java.util.regex.Pattern;

public class num2 {
    public static void main(String[] args) {
        String regex = "^abcdefghijklmnopqrstuv18340$";

        String[] tests = {
                "abcdefghijklmnopqrstuv18340",
                "abcdefghijklmnoasdfasdpqrstuv18340", // лишние символы
                "abcdefghijklmnopqrstuv18340 ",       // пробел в конце
                " abcdefghijklmnopqrstuv18340"        // пробел в начале
        };

        for (String test : tests) {
            boolean isMatch = Pattern.matches(regex, test);
            System.out.println("Строка: \"" + test + "\" -> Соответствует: " + isMatch);
        }
    }
}