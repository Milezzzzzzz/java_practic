package practice10;

import java.util.Arrays;
import java.util.Comparator;

public class num3 {
    public static void main(String[] args) {
        Student[] list1 = new Student[]{
                new Student("Иван", "Иванов", "ИВТ", 1, "ИВТ-11", 4.2, 104),
                new Student("Анна", "Белова", "ПИ", 2, "ПИ-21", 4.9, 101),
                new Student("Петр", "Сидоров", "ИБ", 3, "ИБ-31", 3.8, 105)
        };

        Student[] list2 = new Student[]{
                new Student("Елена", "Дмитриева", "ИВТ", 1, "ИВТ-11", 5.0, 102),
                new Student("Олег", "Андреев", "ПИ", 2, "ПИ-21", 4.5, 103),
                new Student("Мария", "Козлова", "ИБ", 3, "ИБ-31", 4.1, 106)
        };

        System.out.println("Список 1:");
        printArray(list1);
        System.out.println("\nСписок 2:");
        printArray(list2);

        Student[] mergedList = mergeLists(list1, list2);

        System.out.println("\nОбъединенный и отсортированный список:");
        printArray(mergedList);
    }

    public static Student[] mergeLists(Student[] l1, Student[] l2) {
        Student[] result = new Student[l1.length + l2.length];

        System.arraycopy(l1, 0, result, 0, l1.length);
        System.arraycopy(l2, 0, result, l1.length, l2.length);

        
        Arrays.sort(result, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        });

        return result;
    }

    public static void printArray(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }
}