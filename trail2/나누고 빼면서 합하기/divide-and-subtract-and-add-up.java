import java.util.*;

public class Main {
    public static int func(int[] arr, int m) {
        int sum = 0;
        while (true) {
            sum += arr[m];
            if (m == 1) {
                break;
            }
            if (m % 2 != 0) {
                m -= 1;
            }
            else {
                m /= 2;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        int result = func(arr, m);
        System.out.println(result);
    }
}