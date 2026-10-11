package PraktikalWork2;

public class Task2 {

    static class Ball {
        private double x = 0.0;
        private double y = 0.0;

        public Ball() {
        }

        public Ball(double x, double y) {
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

        public void setXY(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public void move(double xDisp, double yDisp) {
            x += xDisp;
            y += yDisp;
        }

        @Override
        public String toString() {
            return "Ball{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    static class TestBall {
        public static void main(String[] args) {

            Ball ball = new Ball(2.5, 3.5);

            System.out.println("Начальное положение:");
            System.out.println(ball);

            ball.setX(5);
            ball.setY(7);

            System.out.println("После изменения координат:");
            System.out.println(ball);

            ball.setXY(10, 15);

            System.out.println("После setXY:");
            System.out.println(ball);

            ball.move(3, -2);

            System.out.println("После перемещения:");
            System.out.println(ball);
        }
    }

    public static void main(String[] args) {
        TestBall.main(args);
    }
}