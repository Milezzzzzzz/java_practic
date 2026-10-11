package PraktikalWork2;

public class Task3 {

    static class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    static class Circle {
        private Point center;
        private double radius;

        public Circle(Point center, double radius) {
            this.center = center;
            this.radius = radius;
        }

        public Point getCenter() {
            return center;
        }

        public void setCenter(Point center) {
            this.center = center;
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

        @Override
        public String toString() {
            return "Circle{" +
                    "center=" + center +
                    ", radius=" + radius +
                    '}';
        }
    }

    static class Tester {
        private Circle[] circles;
        private int count;

        public Tester(int size) {
            circles = new Circle[size];
            count = 0;
        }

        public void addCircle(Circle circle) {
            if (count < circles.length) {
                circles[count] = circle;
                count++;
            }
        }

        public void printCircles() {
            for (int i = 0; i < count; i++) {
                System.out.println(circles[i]);
            }
        }
    }

    public static void main(String[] args) {

        Tester tester = new Tester(3);

        Circle c1 = new Circle(new Point(0, 0), 5);
        Circle c2 = new Circle(new Point(2, 3), 10);
        Circle c3 = new Circle(new Point(-2, 4), 3);

        tester.addCircle(c1);
        tester.addCircle(c2);
        tester.addCircle(c3);

        tester.printCircles();

        System.out.println("Площадь первой окружности: "
                + c1.getArea());
    }
}