public class ArraySumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int summ = 0;
        double middle = 0.0;
        for (int i=0; i < numbers.length; i++) {
            summ+=numbers[i];
        }
        middle = summ / numbers.length;
        System.out.println("sum =" +summ);
        System.out.println("middle=" +middle);
    }
}
