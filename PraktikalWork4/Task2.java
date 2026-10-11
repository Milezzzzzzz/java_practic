package PraktikalWork4;

public class Task2 {

    enum Size {

        XXS(32) {
            @Override
            public String getDescription() {
                return "Детский размер";
            }
        },

        XS(34),
        S(36),
        M(38),
        L(40);

        private final int euroSize;

        Size(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return euroSize;
        }

        public String getDescription() {
            return "Взрослый размер";
        }
    }

    interface MenClothing {
        void dressMan();
    }

    interface WomenClothing {
        void dressWomen();
    }

    static abstract class Clothes {

        protected Size size;
        protected double price;
        protected String color;

        public Clothes(
                Size size,
                double price,
                String color
        ) {
            this.size = size;
            this.price = price;
            this.color = color;
        }

        public Size getSize() {
            return size;
        }

        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return "Размер: " + size
                    + ", цена: " + price
                    + ", цвет: " + color;
        }
    }

    static class TShirt extends Clothes
            implements MenClothing, WomenClothing {

        public TShirt(
                Size size,
                double price,
                String color
        ) {
            super(size, price, color);
        }

        @Override
        public void dressMan() {
            System.out.println(
                    "Мужчина надевает футболку."
            );
        }

        @Override
        public void dressWomen() {
            System.out.println(
                    "Женщина надевает футболку."
            );
        }
    }

    static class Pants extends Clothes
            implements MenClothing, WomenClothing {

        public Pants(
                Size size,
                double price,
                String color
        ) {
            super(size, price, color);
        }

        @Override
        public void dressMan() {
            System.out.println(
                    "Мужчина надевает брюки."
            );
        }

        @Override
        public void dressWomen() {
            System.out.println(
                    "Женщина надевает брюки."
            );
        }
    }

    static class Skirt extends Clothes
            implements WomenClothing {

        public Skirt(
                Size size,
                double price,
                String color
        ) {
            super(size, price, color);
        }

        @Override
        public void dressWomen() {
            System.out.println(
                    "Женщина надевает юбку."
            );
        }
    }

    static class Tie extends Clothes
            implements MenClothing {

        public Tie(
                Size size,
                double price,
                String color
        ) {
            super(size, price, color);
        }

        @Override
        public void dressMan() {
            System.out.println(
                    "Мужчина надевает галстук."
            );
        }
    }

    static class Atelier {

        public void dressWomen(Clothes[] clothes) {

            System.out.println(
                    "Женская одежда:"
            );

            for (Clothes item : clothes) {

                if (item instanceof WomenClothing) {

                    System.out.println(item);

                    ((WomenClothing) item)
                            .dressWomen();
                }
            }
        }

        public void dressMan(Clothes[] clothes) {

            System.out.println(
                    "\nМужская одежда:"
            );

            for (Clothes item : clothes) {

                if (item instanceof MenClothing) {

                    System.out.println(item);

                    ((MenClothing) item)
                            .dressMan();
                }
            }
        }
    }

    public static void main(String[] args) {

        Clothes[] clothes = {

                new TShirt(
                        Size.M,
                        1500,
                        "Белый"
                ),

                new Pants(
                        Size.L,
                        3000,
                        "Черный"
                ),

                new Skirt(
                        Size.S,
                        2500,
                        "Красный"
                ),

                new Tie(
                        Size.M,
                        1200,
                        "Синий"
                )
        };

        System.out.println(
                "Размер XXS: "
                        + Size.XXS.getEuroSize()
                        + ", "
                        + Size.XXS.getDescription()
        );

        System.out.println(
                "Размер M: "
                        + Size.M.getEuroSize()
                        + ", "
                        + Size.M.getDescription()
        );

        Atelier atelier = new Atelier();

        atelier.dressWomen(clothes);

        atelier.dressMan(clothes);
    }
}