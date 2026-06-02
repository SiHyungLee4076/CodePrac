import java.util.*;

public class Main {
    static void func(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            System.out.print("1 ");
            return;
        }
        func(n-1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        func(N);
    }
}