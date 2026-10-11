import java.util.Scanner;
public class MasMaxMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            n = scanner.nextInt();
            if (n<0) {
                System.out.println("массив не может быть отрицательный");
            }
        } while (n<=0);
        int [] mas = new int[n];
        for (int i=0;i<n;i++) {
            mas[i] = scanner.nextInt();
        }
        int summ = 0;
        int min = mas[0];
        int max = mas[0];
        int i = 0;
        while (i < n) {
            summ += mas[i];
            if (mas[i] < min) min = mas[i];
            if (mas[i] > max) max = mas[i];
            i++;
        }
        System.out.println("sum="+summ);
        System.out.println("min="+min);
        System.out.println("max="+max);
    }
}
