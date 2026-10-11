package PraktikalWork2;

public class Task7 {

    static class Book {
        private String author;
        private String title;
        private int year;

        public Book(String author, String title, int year) {
            this.author = author;
            this.title = title;
            this.year = year;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "author='" + author + '\'' +
                    ", title='" + title + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

    static class BookShelf {
        private Book[] books;
        private int count;

        public BookShelf(int size) {
            books = new Book[size];
            count = 0;
        }

        public void addBook(Book book) {
            if (count < books.length) {
                books[count] = book;
                count++;
            }
        }

        public Book getOldestBook() {
            if (count == 0) {
                return null;
            }

            Book oldest = books[0];

            for (int i = 1; i < count; i++) {
                if (books[i].getYear() < oldest.getYear()) {
                    oldest = books[i];
                }
            }

            return oldest;
        }

        public Book getNewestBook() {
            if (count == 0) {
                return null;
            }

            Book newest = books[0];

            for (int i = 1; i < count; i++) {
                if (books[i].getYear() > newest.getYear()) {
                    newest = books[i];
                }
            }

            return newest;
        }

        public void sortByYear() {
            for (int i = 0; i < count - 1; i++) {
                for (int j = 0; j < count - i - 1; j++) {

                    if (books[j].getYear() > books[j + 1].getYear()) {

                        Book temp = books[j];
                        books[j] = books[j + 1];
                        books[j + 1] = temp;
                    }
                }
            }
        }

        public void showBooks() {
            for (int i = 0; i < count; i++) {
                System.out.println(books[i]);
            }
        }
    }

    static class BookTest {
        public static void main(String[] args) {

            BookShelf shelf = new BookShelf(5);

            shelf.addBook(new Book(
                    "Фёдор Достоевский",
                    "Преступление и наказание",
                    1866
            ));

            shelf.addBook(new Book(
                    "Михаил Булгаков",
                    "Мастер и Маргарита",
                    1967
            ));

            shelf.addBook(new Book(
                    "Лев Толстой",
                    "Война и мир",
                    1869
            ));

            System.out.println("Все книги:");
            shelf.showBooks();

            System.out.println("\nСамая ранняя:");
            System.out.println(shelf.getOldestBook());

            System.out.println("\nСамая поздняя:");
            System.out.println(shelf.getNewestBook());

            shelf.sortByYear();

            System.out.println("\nПосле сортировки:");
            shelf.showBooks();
        }
    }

    public static void main(String[] args) {
        BookTest.main(args);
    }
}