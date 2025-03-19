import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= i * i; j += i) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}