import java.util.Scanner;

public class Main {
    public static boolean func1(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean func2(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 0;
        for (int i = A; i <= B; i++) {
            if (func1(i) && func2(i)) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}