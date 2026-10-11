package PraktikalWork3;

public class Task2_2 {

    public static void main(String[] args) {

        String[] classes = {
                "Метод",
                "Boolean",
                "Byte",
                "Character",
                "Double",
                "Float",
                "Integer",
                "Long",
                "Short",
                "static"
        };

        String[][] table = {
                {"byteValue()",        "",  "X", "", "X", "X", "X", "X", "X", "нет"},
                {"doubleValue()",      "",  "X", "", "X", "X", "X", "X", "X", "нет"},
                {"floatValue()",       "",  "X", "", "X", "X", "X", "X", "X", "нет"},
                {"intValue()",         "",  "X", "", "X", "X", "X", "X", "X", "нет"},
                {"longValue()",        "",  "X", "", "X", "X", "X", "X", "X", "нет"},
                {"shortValue()",       "",  "X", "", "X", "X", "X", "X", "X", "нет"},
                {"parseXxx()",         "X", "X", "", "X", "X", "X", "X", "X", "да"},
                {"parseXxx with radix", "", "X", "", "", "", "X", "X", "X", "да"},
                {"valueOf with radix",  "", "X", "", "", "", "X", "X", "X", "да"},
                {"toString()",         "X", "X", "X", "X", "X", "X", "X", "X", "нет"},
                {"toString(primitive)", "X", "X", "X", "X", "X", "X", "X", "X", "да"},
                {"toString(primitive, radix)", "", "X", "", "", "", "X", "X", "X", "да"}
        };

        // Вывод заголовка
        System.out.println("ТАБЛИЦА МЕТОДОВ КЛАССОВ-ОБОЛОЧЕК");
        System.out.println();

        // Ширина столбцов
        int[] widths = {
                30, 10, 10, 12, 10, 10, 10, 10, 10, 10
        };

        // Верхняя граница
        printLine(widths);

        // Заголовок
        for (int i = 0; i < classes.length; i++) {
            System.out.printf(
                    "| %-" + (widths[i] - 1) + "s",
                    classes[i]
            );
        }

        System.out.println("|");

        // Разделитель
        printLine(widths);

        // Сама таблица
        for (String[] row : table) {

            for (int i = 0; i < row.length; i++) {

                System.out.printf(
                        "| %-" + (widths[i] - 1) + "s",
                        row[i]
                );
            }

            System.out.println("|");
        }

        // Нижняя граница
        printLine(widths);
    }

    // Метод рисует горизонтальную линию таблицы
    private static void printLine(int[] widths) {

        for (int width : widths) {

            System.out.print("+");

            for (int i = 0; i < width; i++) {
                System.out.print("-");
            }
        }

        System.out.println("+");
    }
}