import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.print(a + " " + b);

        for (int i = 3; i <= 10; i++) {
            int c = b + 2 * a;
            System.out.print(" " + c);

            a = b;
            b = c;
        }
    }
}
