package PraktikalWork4;

public class Task1 {

    enum Season {

        WINTER(-10) {
            @Override
            public String getDescription() {
                return "Холодное время года";
            }
        },

        SPRING(8),

        SUMMER(22) {
            @Override
            public String getDescription() {
                return "Теплое время года";
            }
        },

        AUTUMN(10);

        private final double averageTemperature;

        Season(double averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public double getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            return "Холодное время года";
        }
    }

    public static void printFavoriteSeason(Season season) {

        switch (season) {

            case WINTER:
                System.out.println("Я люблю зиму");
                break;

            case SPRING:
                System.out.println("Я люблю весну");
                break;

            case SUMMER:
                System.out.println("Я люблю лето");
                break;

            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {

        Season favoriteSeason = Season.SUMMER;

        System.out.println(
                "Любимое время года: " + favoriteSeason
        );

        System.out.println(
                "Средняя температура: "
                        + favoriteSeason.getAverageTemperature()
                        + " °C"
        );

        System.out.println(
                "Описание: "
                        + favoriteSeason.getDescription()
        );

        printFavoriteSeason(favoriteSeason);

        System.out.println("\nВсе времена года:");

        for (Season season : Season.values()) {

            System.out.println(
                    season
                            + ": "
                            + season.getAverageTemperature()
                            + " °C, "
                            + season.getDescription()
            );
        }
    }
}