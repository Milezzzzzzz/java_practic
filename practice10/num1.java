package practice10;

public class num1 {
    public static void main(String[] args) {
        Student student = new Student("Иван", "Иванов", "Программная инженерия", 2, "ПИ-21", 4.7, 101);

        System.out.println("Cтудент:");
        System.out.println(student);

        student.setCourse(3);
        student.setGpa(4.9);

        System.out.println("\nПосле изменения курса и балла:");
        System.out.println(student);
    }
}