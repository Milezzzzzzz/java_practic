package PraktikalWork7;

public class Task7 {

    interface Printable {

        void print();
    }

    static class Magazine
            implements Printable {

        private String name;

        public Magazine(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public void print() {

            System.out.println(
                    "Журнал: " + name
            );
        }

        public static void printMagazines(
                Printable[] printable) {

            for (Printable item : printable) {

                if (item instanceof Magazine) {

                    Magazine magazine =
                            (Magazine) item;

                    System.out.println(
                            magazine.getName()
                    );
                }
            }
        }
    }

    static class Book
            implements Printable {

        private String name;

        public Book(String name) {
            this.name = name;
        }

        @Override
        public void print() {

            System.out.println(
                    "Книга: " + name
            );
        }
    }

    public static void main(String[] args) {

        Printable[] printable = {

                new Magazine("Хакер"),

                new Book("Война и мир"),

                new Magazine("Наука и жизнь"),

                new Book("Преступление и наказание")
        };

        System.out.println(
                "Названия журналов:"
        );

        Magazine.printMagazines(printable);
    }
}