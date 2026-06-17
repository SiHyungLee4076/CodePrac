import java.util.Scanner;

public class Main {
    static int result;
    static int func(int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        return (func(n - 1) * func(n - 2)) % 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        result = func(N);
        System.out.println(result);
    }
}