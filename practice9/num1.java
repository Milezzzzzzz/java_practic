package practice9;

public class num1 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Ivan", "Ivanov", 4.5, 103),
                new Student("Petr", "Petrov", 3.8, 101),
                new Student("Anna", "Sidorova", 4.9, 105),
                new Student("Oleg", "Smirnov", 4.1, 102),
                new Student("Elena", "Kuznetsova", 5.0, 104)
        };

        System.out.println("Исходный массив");
        printStudents(students);

        insertionSortByID(students);

        System.out.println("\nОтсортированный массив");
        printStudents(students);
    }

    public static void insertionSortByID(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getiDNumber() > key.getiDNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printStudents(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double gpa;
    private int iDNumber;

    public Student(String firstName, String lastName, double gpa, int iDNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.iDNumber = iDNumber;
    }

    public int getiDNumber() { return iDNumber; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + iDNumber +
                ", Имя='" + firstName + " " + lastName + '\'' +
                ", GPA=" + gpa +
                '}';
    }
}