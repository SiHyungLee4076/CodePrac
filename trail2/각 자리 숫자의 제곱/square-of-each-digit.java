import java.util.*;

public class Main {
    public static int func(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n % 10;
        return (int)(digit * digit) + func(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}