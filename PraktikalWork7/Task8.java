package PraktikalWork7;

public class Task8 {

    interface Printable {

        void print();
    }

    static class Magazine
            implements Printable {

        private String name;

        public Magazine(String name) {
            this.name = name;
        }

        @Override
        public void print() {

            System.out.println(
                    "Журнал: " + name
            );
        }
    }

    static class Book
            implements Printable {

        private String name;

        public Book(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public void print() {

            System.out.println(
                    "Книга: " + name
            );
        }

        public static void printBooks(
                Printable[] printable) {

            for (Printable item : printable) {

                if (item instanceof Book) {

                    Book book =
                            (Book) item;

                    System.out.println(
                            book.getName()
                    );
                }
            }
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
                "Названия книг:"
        );

        Book.printBooks(printable);
    }
}