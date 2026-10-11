package PraktikalWork7;

public class Task5 {

    interface StringProcessable {

        int countChars(String s);

        String oddPositions(String s);

        String reverse(String s);
    }

    public static void main(String[] args) {

        System.out.println(
                "Интерфейс StringProcessable создан."
        );

        System.out.println(
                "Методы интерфейса:"
        );

        System.out.println(
                "countChars(String s)"
        );

        System.out.println(
                "oddPositions(String s)"
        );

        System.out.println(
                "reverse(String s)"
        );
    }
}