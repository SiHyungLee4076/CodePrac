import java.util.Scanner;

public class Main {
    public static boolean func(int n) {
        if (n % 2 == 0) {
            int sum = (n / 10) + (n % 10);
            if (sum % 5 == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (func(n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}