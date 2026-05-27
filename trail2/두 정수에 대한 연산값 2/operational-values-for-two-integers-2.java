import java.util.Scanner;

public class Main {
    static int a, b;
    public static void func() {
        if (a < b) {
            a += 10;
            b *= 2;
        } else {
            b += 10;
            a *= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        func();
        System.out.println(a + " " + b);
    }
}