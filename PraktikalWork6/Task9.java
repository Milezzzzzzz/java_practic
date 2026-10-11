package PraktikalWork6;

public class Task9 {

    interface Printable {
        void print();
    }

    static class Book implements Printable {

        private String title;

        public Book(String title) {
            this.title = title;
        }

        @Override
        public void print() {
            System.out.println(
                    "Книга: " + title
            );
        }
    }

    static class Magazine implements Printable {

        private String title;

        public Magazine(String title) {
            this.title = title;
        }

        @Override
        public void print() {
            System.out.println(
                    "Журнал: " + title
            );
        }
    }

    public static void main(String[] args) {

        Printable[] publications = {

                new Book("Java для начинающих"),

                new Magazine("Мир технологий"),

                new Book("Основы программирования"),

                new Magazine("Наука и жизнь")
        };

        for (Printable publication : publications) {
            publication.print();
        }
    }
}