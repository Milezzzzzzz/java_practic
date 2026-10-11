package PraktikalWork2;

public class Task6 {

    static class Circle {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getLength() {
            return 2 * Math.PI * radius;
        }

        public boolean compare(Circle other) {
            return this.radius == other.radius;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "radius=" + radius +
                    '}';
        }
    }

    static class CircleTest {
        public static void main(String[] args) {

            Circle circle1 = new Circle(5);
            Circle circle2 = new Circle(10);

            System.out.println(circle1);
            System.out.println(circle2);

            System.out.println("Площадь первой: "
                    + circle1.getArea());

            System.out.println("Длина первой: "
                    + circle1.getLength());

            System.out.println("Окружности равны: "
                    + circle1.compare(circle2));

            circle2.setRadius(5);

            System.out.println("После изменения радиуса:");
            System.out.println("Окружности равны: "
                    + circle1.compare(circle2));
        }
    }

    public static void main(String[] args) {
        CircleTest.main(args);
    }
}