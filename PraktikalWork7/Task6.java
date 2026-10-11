package PraktikalWork7;

public class Task6 {

    interface StringProcessable {

        int countChars(String s);

        String oddPositions(String s);

        String reverse(String s);
    }

    static class ProcessStrings
            implements StringProcessable {

        @Override
        public int countChars(String s) {

            return s.length();
        }

        @Override
        public String oddPositions(String s) {

            StringBuilder result =
                    new StringBuilder();

            for (int i = 0; i < s.length(); i += 2) {

                result.append(
                        s.charAt(i)
                );
            }

            return result.toString();
        }

        @Override
        public String reverse(String s) {

            return new StringBuilder(s)
                    .reverse()
                    .toString();
        }
    }

    public static void main(String[] args) {

        ProcessStrings process =
                new ProcessStrings();

        String text = "Программирование";

        System.out.println(
                "Исходная строка: "
                        + text
        );

        System.out.println(
                "Количество символов: "
                        + process.countChars(text)
        );

        System.out.println(
                "Символы на нечётных позициях: "
                        + process.oddPositions(text)
        );

        System.out.println(
                "Инвертированная строка: "
                        + process.reverse(text)
        );
    }
}