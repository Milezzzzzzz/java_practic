package PraktikalWork2;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

    static class Computer {
        private String name;
        private double price;

        public Computer(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Компьютер: " + name +
                    ", цена: " + price + " руб.";
        }
    }

    static class Shop {
        private ArrayList<Computer> computers = new ArrayList<>();

        public void addComputer(Computer computer) {
            computers.add(computer);
        }

        public void removeComputer(String name) {
            computers.removeIf(computer ->
                    computer.getName().equalsIgnoreCase(name));
        }

        public Computer findComputer(String name) {
            for (Computer computer : computers) {
                if (computer.getName().equalsIgnoreCase(name)) {
                    return computer;
                }
            }

            return null;
        }

        public void showComputers() {
            for (Computer computer : computers) {
                System.out.println(computer);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.print("Введите количество компьютеров: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Введите название компьютера: ");
            String name = scanner.nextLine();

            System.out.print("Введите цену: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            shop.addComputer(new Computer(name, price));
        }

        System.out.println("\nКомпьютеры в магазине:");
        shop.showComputers();

        System.out.print("\nВведите название компьютера для поиска: ");
        String searchName = scanner.nextLine();

        Computer found = shop.findComputer(searchName);

        if (found != null) {
            System.out.println("Найден: " + found);
        } else {
            System.out.println("Компьютер не найден.");
        }

        System.out.print("\nВведите название компьютера для удаления: ");
        String deleteName = scanner.nextLine();

        shop.removeComputer(deleteName);

        System.out.println("\nПосле удаления:");
        shop.showComputers();

        scanner.close();
    }
}