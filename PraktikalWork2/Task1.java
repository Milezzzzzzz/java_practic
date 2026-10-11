package PraktikalWork2;

public class Task1 {

    static class Author {
        private String name;
        private String email;
        private char gender;

        public Author(String name, String email, char gender) {
            this.name = name;
            this.email = email;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public char getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Author{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    static class TestAuthor {
        public static void main(String[] args) {

            Author author = new Author(
                    "Иван Иванов",
                    "ivan@mail.ru",
                    'm'
            );

            System.out.println(author);

            System.out.println("Имя: " + author.getName());
            System.out.println("Email: " + author.getEmail());
            System.out.println("Пол: " + author.getGender());

            author.setEmail("newmail@mail.ru");

            System.out.println("Новый email: " + author.getEmail());
        }
    }

    public static void main(String[] args) {
        TestAuthor.main(args);
    }
}