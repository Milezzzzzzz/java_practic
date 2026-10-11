package PraktikalWork6;

public class Task4 {

    interface Priceable {
        double getPrice();
    }

    static class Product implements Priceable {

        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + ": " + price + " руб.";
        }
    }

    static class Car implements Priceable {

        private String model;
        private double price;

        public Car(String model, double price) {
            this.model = model;
            this.price = price;
        }

        @Override
        public double getPrice() {
            return price;
        }
    }

    static class Book implements Priceable {

        private String title;
        private double price;

        public Book(String title, double price) {
            this.title = title;
            this.price = price;
        }

        @Override
        public double getPrice() {
            return price;
        }
    }

    public static void main(String[] args) {

        Priceable[] objects = {
                new Product("Ноутбук", 80000),
                new Car("Toyota Camry", 3500000),
                new Book("Java", 1200)
        };

        for (Priceable object : objects) {
            System.out.println(
                    "Цена: " + object.getPrice() + " руб."
            );
        }
    }
}