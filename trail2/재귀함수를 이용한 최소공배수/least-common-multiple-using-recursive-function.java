import java.util.Scanner;

public class Main {
    static int func1(int a, int b) {
        if (b == 0)
            return a;
        return func1(b, a % b);
    }

    static long func2(int a, int b) {
        if (b == 0)
            return a;
        
        int gcd = func1(a, b);
        return (long) a / gcd * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        long result = arr[0];

        for (int i = 1; i < n; i++)
            result = func2((int) result, arr[i]);

        System.out.println(result);
    }
}
