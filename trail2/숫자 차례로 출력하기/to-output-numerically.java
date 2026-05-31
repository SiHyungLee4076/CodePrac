import java.util.Scanner;

public class Main {
    static void func1(int n) {
        if (n == 0) return;
        func1(n - 1);
        System.out.print(n + " ");
    }
    static void func2(int n) {
        if (n == 0) return;
        System.out.print(n + " ");
        func2(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        func1(N);
        System.out.println();
        func2(N);
    }
}