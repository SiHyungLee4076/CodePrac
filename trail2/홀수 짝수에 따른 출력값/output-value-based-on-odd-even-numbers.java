import java.util.*;

public class Main {
    public static int func(int n) {
        int sum = 0;
        if (n % 2 == 1) {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        } 
        else {
            for (int j = 2; j <= n; j++) {
                if (j % 2 == 0) {
                    sum += j;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = func(n);
        System.out.println(result);
    }
}