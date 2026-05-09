import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            arr[i] = n;
            count++;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}