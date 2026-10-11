package PraktikalWork6;

public class Task8 {

    interface Printable {
        void print();
    }

    static class Shop implements Printable {

        private String name;

        public Shop(String name) {
            this.name = name;
        }

        @Override
        public void print() {
            System.out.println(
                    "Магазин: " + name
            );
        }
    }

    public static void main(String[] args) {

        Printable shop =
                new Shop("Компьютерный мир");

        shop.print();
    }
}