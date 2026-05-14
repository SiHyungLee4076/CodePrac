import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(getLCM(n, m));
    }

    public static int getGCD(int n, int m) {
        while (m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        return n;
    }

    public static int getLCM(int n, int m) {
        if (n == 0 || m == 0) return 0;
        return (n * m) / getGCD(n, m);
    }
}