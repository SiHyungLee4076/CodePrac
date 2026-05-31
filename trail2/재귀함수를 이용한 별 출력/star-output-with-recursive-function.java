import java.util.*;

public class Main {
    static void func(int n) {
        if (n == 0) {
            return;
        }
        func(n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}