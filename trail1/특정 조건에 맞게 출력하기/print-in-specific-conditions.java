import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            else if (n % 2 == 1) {
                int k = n + 3;
                System.out.printf("%d ", k);
            }
            else {
                int k = n / 2;
                System.out.printf("%d ", k);
            }
        }
    }
}