package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class num5 {
    private static final int N = 50000;

    public static void main(String[] args) {
        System.out.println("Тестирование на " + N + " элементов...\n");

        System.out.println("ArrayList");
        testList(new ArrayList<>());


        System.out.println("\nLinkedList");
        testList(new LinkedList<>());
    }

    public static void testList(List<Integer> list) {

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.println("Добавление в конец:  " + (end - start) / 1_000_000.0 + " мс");


        start = System.nanoTime();
        list.add(0, -1);
        end = System.nanoTime();
        System.out.println("Вставка в начало:    " + (end - start) / 1_000_000.0 + " мс");

        start = System.nanoTime();
        boolean found = list.contains(N / 2);
        end = System.nanoTime();
        System.out.println("Поиск по образцу:    " + (end - start) / 1_000_000.0 + " мс (найдено: " + found + ")");

        start = System.nanoTime();
        list.remove(N / 2);
        end = System.nanoTime();
        System.out.println("Удаление из середины:" + (end - start) / 1_000_000.0 + " мс");
    }
}