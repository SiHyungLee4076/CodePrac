import java.util.Scanner;

public class Main {
    public static int func(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + func(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * b * c;
        System.out.println(func(result));
    }
}