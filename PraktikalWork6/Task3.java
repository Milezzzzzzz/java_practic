package PraktikalWork6;

public class Task3 {

    interface Nameable {
        String getName();
    }

    static class Planet implements Nameable {

        private String name;

        public Planet(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    static class Car implements Nameable {

        private String name;

        public Car(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    static class Animal implements Nameable {

        private String name;

        public Animal(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {

        Nameable[] objects = {
                new Planet("Земля"),
                new Car("Toyota"),
                new Animal("Барсик")
        };

        for (Nameable object : objects) {
            System.out.println(object.getName());
        }
    }
}