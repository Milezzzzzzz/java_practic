package PraktikalWork6;

public class Task5 {

    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    static class MovablePoint implements Movable {

        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;

        public MovablePoint(int x, int y,
                            int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        @Override
        public void moveUp() {
            y += ySpeed;
        }

        @Override
        public void moveDown() {
            y -= ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y +
                    "), скорость=(" +
                    xSpeed + ", " + ySpeed + ")";
        }
    }

    static class MovableCircle implements Movable {

        private MovablePoint center;
        private int radius;

        public MovableCircle(int x, int y,
                             int xSpeed, int ySpeed,
                             int radius) {

            center =
                    new MovablePoint(
                            x, y, xSpeed, ySpeed
                    );

            this.radius = radius;
        }

        @Override
        public void moveUp() {
            center.moveUp();
        }

        @Override
        public void moveDown() {
            center.moveDown();
        }

        @Override
        public void moveLeft() {
            center.moveLeft();
        }

        @Override
        public void moveRight() {
            center.moveRight();
        }

        @Override
        public String toString() {
            return "Центр=" + center +
                    ", радиус=" + radius;
        }
    }

    public static void main(String[] args) {

        MovablePoint point =
                new MovablePoint(10, 10, 2, 3);

        MovableCircle circle =
                new MovableCircle(20, 20, 1, 1, 5);

        point.moveLeft();
        circle.moveUp();

        System.out.println("Точка: " + point);
        System.out.println("Круг: " + circle);
    }
}