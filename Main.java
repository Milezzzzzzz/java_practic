import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s = "hello,";
        String s1 = "mirea";
        System.out.println(s+s1);
        System.out.println("Hello and welcome!");
        int x = 56;
        int y = 123;
        int z = x+y;
        System.out.println("z =" +(x+y));

        Scanner scanner = new Scanner(System.in);
        System.out.println("x =");
        x = scanner.nextInt();
        System.out.println("y =");
        y = scanner.nextInt();
        System.out.println(x+y);
    }
}
