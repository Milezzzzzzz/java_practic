package practice9;

import java.util.Comparator;

public class num2 {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("Ivan", "Ivanov", 4.5, 103),
                new Student("Petr", "Petrov", 3.8, 101),
                new Student("Anna", "Sidorova", 4.9, 105),
                new Student("Oleg", "Smirnov", 4.1, 102),
                new Student("Elena", "Kuznetsova", 5.0, 104)
        };

        System.out.println("Исходный массив:");
        printStudents(students);

        Comparator<Student> gpaComparator = new SortingStudentsByGPA();

        quickSort(students, 0, students.length - 1, gpaComparator);

        System.out.println("\nОтсортированный массив");
        printStudents(students);
    }

    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(arr, low, high, comparator);

            quickSort(arr, low, pi - 1, comparator);
            quickSort(arr, pi + 1, high, comparator);
        }
    }

    private static int partition(Student[] arr, int low, int high, Comparator<Student> comparator) {
        Student pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {

            if (comparator.compare(arr[j], pivot) < 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printStudents(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}