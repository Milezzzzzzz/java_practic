package practice10;

import java.util.Comparator;

public class num2 {
    public static void main(String[] args) {
        SortingStudentsByGPA tester = new SortingStudentsByGPA();

        tester.setArray();
        System.out.println("Исходный массив:");
        tester.outArray();

        tester.quicksort();
        System.out.println("\nПосле QuickSort:");
        tester.outArray();

        tester.mergeSortByLastName();
        System.out.println("\nПосле MergeSort:");
        tester.outArray();
    }
}

class SortingStudentsByGPA {
    private Student[] students;

    public void setArray() {
        students = new Student[]{
                new Student("Иван", "Яковлев", "ИВТ", 1, "ИВТ-11", 4.2, 104),
                new Student("Анна", "Белова", "ПИ", 2, "ПИ-21", 4.9, 101),
                new Student("Петр", "Сидоров", "ИБ", 3, "ИБ-31", 3.8, 105),
                new Student("Елена", "Дмитриева", "ИВТ", 1, "ИВТ-11", 5.0, 102),
                new Student("Олег", "Андреев", "ПИ", 2, "ПИ-21", 4.5, 103)
        };
    }

    public void outArray() {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void quicksort() {
        Comparator<Student> gpaComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Сортировка по убыванию
                return Double.compare(s2.getGpa(), s1.getGpa());
            }
        };
        quickSortRecursive(students, 0, students.length - 1, gpaComparator);
    }

    private void quickSortRecursive(Student[] arr, int low, int high, Comparator<Student> comp) {
        if (low < high) {
            int pi = partition(arr, low, high, comp);
            quickSortRecursive(arr, low, pi - 1, comp);
            quickSortRecursive(arr, pi + 1, high, comp);
        }
    }

    private int partition(Student[] arr, int low, int high, Comparator<Student> comp) {
        Student pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (comp.compare(arr[j], pivot) < 0) {
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

    public void mergeSortByLastName() {
        Comparator<Student> lastNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getLastName().compareToIgnoreCase(s2.getLastName());
            }
        };
        mergeSortRecursive(students, 0, students.length - 1, lastNameComparator);
    }

    private void mergeSortRecursive(Student[] arr, int left, int right, Comparator<Student> comp) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSortRecursive(arr, left, mid, comp);
            mergeSortRecursive(arr, mid + 1, right, comp);
            merge(arr, left, mid, right, comp);
        }
    }

    private void merge(Student[] arr, int left, int mid, int right, Comparator<Student> comp) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Student[] L = new Student[n1];
        Student[] R = new Student[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (comp.compare(L[i], R[j]) <= 0) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}