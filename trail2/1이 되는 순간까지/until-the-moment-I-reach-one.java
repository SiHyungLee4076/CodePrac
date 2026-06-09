import java.util.*;

public class Main {
    static int count = 0;

    static void func(int n) {
        if (n == 1) {
            return;
        }
        count++;
        if (n % 2 == 0) {
            func(n / 2);
        } else {
            func(n / 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        func(N);
        System.out.println(count);
    }
}