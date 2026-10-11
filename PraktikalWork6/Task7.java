package PraktikalWork6;

public class Task7 {

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

    public static void main(String[] args) {

        Printable book =
                new Book("Война и мир");

        book.print();
    }
}