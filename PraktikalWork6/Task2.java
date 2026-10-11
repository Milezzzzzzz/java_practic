package PraktikalWork6;

public class Task2 {

    interface Movable {
        void moveUp();
        void moveDown();
        void moveLeft();
        void moveRight();
    }

    static class MovablePoint implements Movable {

        int x;
        int y;
        int xSpeed;
        int ySpeed;

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
    }

    static class MovableRectangle implements Movable {

        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        public MovableRectangle(MovablePoint topLeft,
                                MovablePoint bottomRight) {

            if (topLeft.xSpeed != bottomRight.xSpeed ||
                    topLeft.ySpeed != bottomRight.ySpeed) {

                throw new IllegalArgumentException(
                        "Скорости точек должны совпадать"
                );
            }

            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        @Override
        public void moveUp() {
            topLeft.moveUp();
            bottomRight.moveUp();
        }

        @Override
        public void moveDown() {
            topLeft.moveDown();
            bottomRight.moveDown();
        }

        @Override
        public void moveLeft() {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }

        @Override
        public void moveRight() {
            topLeft.moveRight();
            bottomRight.moveRight();
        }

        @Override
        public String toString() {
            return "MovableRectangle{" +
                    "topLeft=(" + topLeft.x + ", " + topLeft.y + ")" +
                    ", bottomRight=(" +
                    bottomRight.x + ", " + bottomRight.y + ")" +
                    '}';
        }
    }

    public static void main(String[] args) {

        MovablePoint point1 =
                new MovablePoint(0, 10, 2, 2);

        MovablePoint point2 =
                new MovablePoint(10, 0, 2, 2);

        MovableRectangle rectangle =
                new MovableRectangle(point1, point2);

        rectangle.moveRight();
        rectangle.moveUp();

        System.out.println(rectangle);
    }
}