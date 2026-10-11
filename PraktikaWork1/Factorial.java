public class Factorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] test = {0, 1, 2, 3, 4, 5, 10};
        for (int n : test) {
            System.out.println(n + "! = " + factorial(n));
        }
    }
}
