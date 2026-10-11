package PraktikalWork7;

public class Task1 {

    interface Movable {
        void moveUp();

        void moveDown();

        void moveLeft();

        void moveRight();
    }

    public static void main(String[] args) {

        System.out.println("Интерфейс Movable создан.");

        System.out.println("Методы интерфейса:");
        System.out.println("moveUp()");
        System.out.println("moveDown()");
        System.out.println("moveLeft()");
        System.out.println("moveRight()");
    }
}