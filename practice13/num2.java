package practice13;

public class num2 {
    public static void main(String[] args) {
        Person p1 = new Person("Иванов", "Иван", "Иванович");
        Person p2 = new Person("Петров", "Петр", null); // Отчество отсутствует
        Person p3 = new Person("Сидорова", null, "Сергеевна"); // Имя отсутствует

        System.out.println(p1.getFullName());
        System.out.println(p2.getFullName());
        System.out.println(p3.getFullName());
    }
}

class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();

        sb.append(lastName);

        if (firstName != null && !firstName.trim().isEmpty()) {
            sb.append(" ").append(firstName.charAt(0)).append(".");
        }

        if (middleName != null && !middleName.trim().isEmpty()) {
            sb.append(" ").append(middleName.charAt(0)).append(".");
        }

        return sb.toString();
    }
}