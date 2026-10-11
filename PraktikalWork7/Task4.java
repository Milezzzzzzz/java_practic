package PraktikalWork7;

public class Task4 {

    interface MathCalculable {

        double PI = Math.PI;

        double pow(double number, int degree);

        double abs(double real, double imaginary);
    }

    static class MathFunc implements MathCalculable {

        @Override
        public double pow(
                double number,
                int degree) {

            return Math.pow(number, degree);
        }

        @Override
        public double abs(
                double real,
                double imaginary) {

            return Math.sqrt(
                    real * real +
                            imaginary * imaginary
            );
        }

        public double circumference(
                double radius) {

            return 2 * PI * radius;
        }
    }

    public static void main(String[] args) {

        MathCalculable mc1 = new MathFunc();

        System.out.println(
                "Число PI = "
                        + MathCalculable.PI
        );

        System.out.println(
                "2 в степени 3 = "
                        + mc1.pow(2, 3)
        );

        System.out.println(
                "Модуль комплексного числа 3 + 4i = "
                        + mc1.abs(3, 4)
        );

        MathFunc mathFunc = new MathFunc();

        System.out.println(
                "Длина окружности радиуса 5 = "
                        + mathFunc.circumference(5)
        );
    }
}