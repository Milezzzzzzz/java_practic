package practice11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class num3 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Date birthDate = new Date(103, 4, 15);

        Student student = new Student("Иван", "Иванов", "ПИ-21", birthDate);

        // Выводим в коротком формате (dd.MM.yy)
        System.out.println("Короткий формат:\n" + student.toString("dd.MM.yy"));

        // Выводим в среднем формате (dd MMM yyyy)
        System.out.println("\nСредний формат:\n" + student.toString("dd MMM yyyy"));

        // Выводим в полном формате (EEEE, dd MMMM yyyy)
        System.out.println("\nПолный формат:\n" + student.toString("EEEE, dd MMMM yyyy"));
    }
}

class Student {
    private String firstName;
    private String lastName;
    private String group;
    private Date birthDate;

    public Student(String firstName, String lastName, String group, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.birthDate = birthDate;
    }

    public String toString(String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        String formattedDate = sdf.format(birthDate);

        return "Студент: " + lastName + " " + firstName +
                ", Группа: " + group +
                ", Дата рождения: " + formattedDate;
    }


    @Override
    public String toString() {
        return toString("dd.MM.yyyy");
    }
}